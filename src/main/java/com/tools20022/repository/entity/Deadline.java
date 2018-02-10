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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the different deadlines available for the different processes
 * related to corporate action processes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Deadline" src="doc-files/Deadline.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmRelatedCorporateActionEvent
 * Deadline.mmRelatedCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
 * Deadline.mmMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
 * Deadline.mmIntermediaryDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
 * Deadline.mmSTPDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#mmRelatedMeeting
 * Deadline.mmRelatedMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
 * CorporateActionEvent.mmDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
 * Meeting.mmDeadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmBorrowerStockLendingDeadline
 * CorporateActionDate48.mmBorrowerStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmBorrowerStockLendingDeadline
 * CorporateActionDate55.mmBorrowerStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmBorrowerStockLendingDeadline
 * CorporateActionDate64.mmBorrowerStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmBorrowerStockLendingDeadline
 * CorporateActionDate71.mmBorrowerStockLendingDeadline}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBlockingDeadline
 * SecuritiesBlockingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRegistrationDeadline
 * SecuritiesRegistrationDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MeetingDeadline
 * MeetingDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CorporateActionDeadline
 * CorporateActionDeadline}</li>
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
 * "Deadline"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different deadlines available for the different processes related to corporate action processes."
 * </li>
 * </ul>
 */
public class Deadline {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDeadline
	 * CorporateActionEvent.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Related corporate action event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Related corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmDeadline;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected ISODateTime marketDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmMarketDeadline
	 * CorporateActionDate6.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmMarketDeadline
	 * CorporateActionDate10.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmMarketDeadline
	 * CorporateActionDate18.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmMarketDeadline
	 * CorporateActionDate19.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmMarketDeadline
	 * CorporateActionDate8.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmMarketDeadline
	 * CorporateActionDate11.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmMarketDeadline
	 * CorporateActionDate15.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmMarketDeadline
	 * CorporateActionDate16.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentMarketDeadline
	 * ProxyParameters.mmProxyAppointmentMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice1.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalMarketDeadline
	 * MeetingNotice1.mmResolutionProposalMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteMarketDeadline
	 * VoteParameters.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteWithPremiumMarketDeadline
	 * VoteParameters.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesReregistrationMarketDeadline
	 * EntitlementAssessment.mmSecuritiesReregistrationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmMarketDeadline
	 * ProxyAppointmentInformation1.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice2.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalMarketDeadline
	 * MeetingNotice2.mmResolutionProposalMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteMarketDeadline
	 * VoteParameters1.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilityMarketDeadline
	 * VoteParameters1.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumMarketDeadline
	 * VoteParameters1.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment1.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment1.mmRegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment1.mmRegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#mmAdditionalRightMarketDeadline
	 * AdditionalRights1.mmAdditionalRightMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmMarketDeadline
	 * ProxyAppointmentInformation2.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice3.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteMarketDeadline
	 * VoteParameters2.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilityMarketDeadline
	 * VoteParameters2.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumMarketDeadline
	 * VoteParameters2.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment2.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment2.mmRegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment2.mmRegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteMarketDeadline
	 * VoteParameters3.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilityMarketDeadline
	 * VoteParameters3.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumMarketDeadline
	 * VoteParameters3.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmMarketDeadline
	 * CorporateActionDate4.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#mmMarketDeadline
	 * CorporateActionOption11.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmMarketDeadline
	 * CorporateActionDate29.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmMarketDeadline
	 * CorporateActionDate33.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingMarketDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationMarketDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteMarketDeadline
	 * VoteParameters4.mmVoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityMarketDeadline
	 * VoteParameters4.mmRevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumMarketDeadline
	 * VoteParameters4.mmVoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice4.mmAttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmMarketDeadline
	 * ProxyAppointmentInformation3.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#mmAdditionalRightMarketDeadline
	 * AdditionalRights2.mmAdditionalRightMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmMarketDeadline
	 * CorporateActionDate46.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmMarketDeadline
	 * CorporateActionDate48.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmMarketDeadline
	 * CorporateActionDate52.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmMarketDeadline
	 * CorporateActionDate55.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventDeadlines1#mmMarketDeadline
	 * CorporateActionEventDeadlines1.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate60#mmMarketDeadline
	 * CorporateActionDate60.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate64#mmMarketDeadline
	 * CorporateActionDate64.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate68#mmMarketDeadline
	 * CorporateActionDate68.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate71#mmMarketDeadline
	 * CorporateActionDate71.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventDeadlines2#mmMarketDeadline
	 * CorporateActionEventDeadlines2.mmMarketDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate6.mmMarketDeadline, CorporateActionDate10.mmMarketDeadline, CorporateActionDate18.mmMarketDeadline, CorporateActionDate19.mmMarketDeadline,
					CorporateActionDate8.mmMarketDeadline, CorporateActionDate11.mmMarketDeadline, CorporateActionDate15.mmMarketDeadline, CorporateActionDate16.mmMarketDeadline, ProxyParameters.mmProxyAppointmentMarketDeadline,
					MeetingNotice1.mmAttendanceConfirmationMarketDeadline, MeetingNotice1.mmResolutionProposalMarketDeadline, VoteParameters.mmVoteMarketDeadline, VoteParameters.mmVoteWithPremiumMarketDeadline,
					EntitlementAssessment.mmSecuritiesBlockingMarketDeadline, EntitlementAssessment.mmSecuritiesReregistrationMarketDeadline, ProxyAppointmentInformation1.mmMarketDeadline,
					MeetingNotice2.mmAttendanceConfirmationMarketDeadline, MeetingNotice2.mmResolutionProposalMarketDeadline, VoteParameters1.mmVoteMarketDeadline, VoteParameters1.mmRevocabilityMarketDeadline,
					VoteParameters1.mmVoteWithPremiumMarketDeadline, EntitlementAssessment1.mmSecuritiesBlockingMarketDeadline, EntitlementAssessment1.mmRegistrationSecuritiesMarketDeadline,
					EntitlementAssessment1.mmRegistrationParticipationMarketDeadline, AdditionalRights1.mmAdditionalRightMarketDeadline, ProxyAppointmentInformation2.mmMarketDeadline, MeetingNotice3.mmAttendanceConfirmationMarketDeadline,
					VoteParameters2.mmVoteMarketDeadline, VoteParameters2.mmRevocabilityMarketDeadline, VoteParameters2.mmVoteWithPremiumMarketDeadline, EntitlementAssessment2.mmSecuritiesBlockingMarketDeadline,
					EntitlementAssessment2.mmRegistrationSecuritiesMarketDeadline, EntitlementAssessment2.mmRegistrationParticipationMarketDeadline, VoteParameters3.mmVoteMarketDeadline, VoteParameters3.mmRevocabilityMarketDeadline,
					VoteParameters3.mmVoteWithPremiumMarketDeadline, CorporateActionDate4.mmMarketDeadline, CorporateActionOption11.mmMarketDeadline, CorporateActionDate29.mmMarketDeadline, CorporateActionDate33.mmMarketDeadline,
					EntitlementAssessment3.mmSecuritiesBlockingMarketDeadline, EntitlementAssessment3.mmRegistrationSecuritiesMarketDeadline, EntitlementAssessment3.mmRegistrationParticipationMarketDeadline,
					VoteParameters4.mmVoteMarketDeadline, VoteParameters4.mmRevocabilityMarketDeadline, VoteParameters4.mmVoteWithPremiumMarketDeadline, MeetingNotice4.mmAttendanceConfirmationMarketDeadline,
					ProxyAppointmentInformation3.mmMarketDeadline, AdditionalRights2.mmAdditionalRightMarketDeadline, CorporateActionDate46.mmMarketDeadline, CorporateActionDate48.mmMarketDeadline, CorporateActionDate52.mmMarketDeadline,
					CorporateActionDate55.mmMarketDeadline, CorporateActionEventDeadlines1.mmMarketDeadline, CorporateActionDate60.mmMarketDeadline, CorporateActionDate64.mmMarketDeadline, CorporateActionDate68.mmMarketDeadline,
					CorporateActionDate71.mmMarketDeadline, CorporateActionEventDeadlines2.mmMarketDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Deadline.class.getMethod("getMarketDeadline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime intermediaryDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentDeadline
	 * ProxyParameters.mmProxyAppointmentDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationDeadline
	 * MeetingNotice1.mmAttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalDeadline
	 * MeetingNotice1.mmResolutionProposalDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteDeadline
	 * VoteParameters.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteWithPremiumDeadline
	 * VoteParameters.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#mmSecuritiesReregistrationDeadline
	 * EntitlementAssessment.mmSecuritiesReregistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationDeadline
	 * MeetingNotice2.mmAttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalDeadline
	 * MeetingNotice2.mmResolutionProposalDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteDeadline
	 * VoteParameters1.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilityDeadline
	 * VoteParameters1.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumDeadline
	 * VoteParameters1.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment1.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment1.mmRegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationDeadline
	 * EntitlementAssessment1.mmRegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationDeadline
	 * MeetingNotice3.mmAttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteDeadline
	 * VoteParameters2.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilityDeadline
	 * VoteParameters2.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumDeadline
	 * VoteParameters2.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment2.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment2.mmRegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationDeadline
	 * EntitlementAssessment2.mmRegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteDeadline
	 * VoteParameters3.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilityDeadline
	 * VoteParameters3.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumDeadline
	 * VoteParameters3.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteDeadline
	 * VoteParameters4.mmVoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilityDeadline
	 * VoteParameters4.mmRevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmEarlyVoteWithPremiumDeadline
	 * VoteParameters4.mmEarlyVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumDeadline
	 * VoteParameters4.mmVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationDeadline
	 * MeetingNotice4.mmAttendanceConfirmationDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIntermediaryDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ProxyParameters.mmProxyAppointmentDeadline, MeetingNotice1.mmAttendanceConfirmationDeadline, MeetingNotice1.mmResolutionProposalDeadline, VoteParameters.mmVoteDeadline,
					VoteParameters.mmVoteWithPremiumDeadline, EntitlementAssessment.mmSecuritiesBlockingDeadline, EntitlementAssessment.mmSecuritiesReregistrationDeadline, MeetingNotice2.mmAttendanceConfirmationDeadline,
					MeetingNotice2.mmResolutionProposalDeadline, VoteParameters1.mmVoteDeadline, VoteParameters1.mmRevocabilityDeadline, VoteParameters1.mmVoteWithPremiumDeadline, EntitlementAssessment1.mmSecuritiesBlockingDeadline,
					EntitlementAssessment1.mmRegistrationSecuritiesDeadline, EntitlementAssessment1.mmRegistrationParticipationDeadline, MeetingNotice3.mmAttendanceConfirmationDeadline, VoteParameters2.mmVoteDeadline,
					VoteParameters2.mmRevocabilityDeadline, VoteParameters2.mmVoteWithPremiumDeadline, EntitlementAssessment2.mmSecuritiesBlockingDeadline, EntitlementAssessment2.mmRegistrationSecuritiesDeadline,
					EntitlementAssessment2.mmRegistrationParticipationDeadline, VoteParameters3.mmVoteDeadline, VoteParameters3.mmRevocabilityDeadline, VoteParameters3.mmVoteWithPremiumDeadline,
					EntitlementAssessment3.mmSecuritiesBlockingDeadline, EntitlementAssessment3.mmRegistrationSecuritiesDeadline, EntitlementAssessment3.mmRegistrationParticipationDeadline, VoteParameters4.mmVoteDeadline,
					VoteParameters4.mmRevocabilityDeadline, VoteParameters4.mmEarlyVoteWithPremiumDeadline, VoteParameters4.mmVoteWithPremiumDeadline, MeetingNotice4.mmAttendanceConfirmationDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntermediaryDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Deadline.class.getMethod("getIntermediaryDeadline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime sTPDeadline;
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
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmProxyAppointmentElectronicDeadline
	 * ProxyParameters.mmProxyAppointmentElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationElectronicDeadline
	 * MeetingNotice1.mmAttendanceConfirmationElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteElectronicDeadline
	 * VoteParameters.mmVoteElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#mmVoteWithPremiumElectronicDeadline
	 * VoteParameters.mmVoteWithPremiumElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice2.mmAttendanceConfirmationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteSTPDeadline
	 * VoteParameters1.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmRevocabilitySTPDeadline
	 * VoteParameters1.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#mmVoteWithPremiumSTPDeadline
	 * VoteParameters1.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment1.mmSecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment1.mmRegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment1.mmRegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice3.mmAttendanceConfirmationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteSTPDeadline
	 * VoteParameters2.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmRevocabilitySTPDeadline
	 * VoteParameters2.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#mmVoteWithPremiumSTPDeadline
	 * VoteParameters2.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment2.mmSecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment2.mmRegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment2.mmRegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteSTPDeadline
	 * VoteParameters3.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmRevocabilitySTPDeadline
	 * VoteParameters3.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#mmVoteWithPremiumSTPDeadline
	 * VoteParameters3.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmSecuritiesBlockingSTPDeadline
	 * EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#mmRegistrationParticipationSTPDeadline
	 * EntitlementAssessment3.mmRegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteSTPDeadline
	 * VoteParameters4.mmVoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmRevocabilitySTPDeadline
	 * VoteParameters4.mmRevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#mmVoteWithPremiumSTPDeadline
	 * VoteParameters4.mmVoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice4.mmAttendanceConfirmationSTPDeadline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "STPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSTPDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ProxyParameters.mmProxyAppointmentElectronicDeadline, MeetingNotice1.mmAttendanceConfirmationElectronicDeadline, VoteParameters.mmVoteElectronicDeadline,
					VoteParameters.mmVoteWithPremiumElectronicDeadline, MeetingNotice2.mmAttendanceConfirmationSTPDeadline, VoteParameters1.mmVoteSTPDeadline, VoteParameters1.mmRevocabilitySTPDeadline,
					VoteParameters1.mmVoteWithPremiumSTPDeadline, EntitlementAssessment1.mmSecuritiesBlockingSTPDeadline, EntitlementAssessment1.mmRegistrationSecuritiesSTPDeadline,
					EntitlementAssessment1.mmRegistrationParticipationSTPDeadline, MeetingNotice3.mmAttendanceConfirmationSTPDeadline, VoteParameters2.mmVoteSTPDeadline, VoteParameters2.mmRevocabilitySTPDeadline,
					VoteParameters2.mmVoteWithPremiumSTPDeadline, EntitlementAssessment2.mmSecuritiesBlockingSTPDeadline, EntitlementAssessment2.mmRegistrationSecuritiesSTPDeadline,
					EntitlementAssessment2.mmRegistrationParticipationSTPDeadline, VoteParameters3.mmVoteSTPDeadline, VoteParameters3.mmRevocabilitySTPDeadline, VoteParameters3.mmVoteWithPremiumSTPDeadline,
					EntitlementAssessment3.mmSecuritiesBlockingSTPDeadline, EntitlementAssessment3.mmRegistrationSecuritiesSTPDeadline, EntitlementAssessment3.mmRegistrationParticipationSTPDeadline, VoteParameters4.mmVoteSTPDeadline,
					VoteParameters4.mmRevocabilitySTPDeadline, VoteParameters4.mmVoteWithPremiumSTPDeadline, MeetingNotice4.mmAttendanceConfirmationSTPDeadline);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Deadline.class.getMethod("getSTPDeadline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Meeting relatedMeeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDeadline
	 * Meeting.mmDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Deadline
	 * Deadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which deadlines are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Deadline.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Meeting for which deadlines are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmDeadline;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Deadline";
				definition = "Specifies the different deadlines available for the different processes related to corporate action processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmDeadline, com.tools20022.repository.entity.Meeting.mmDeadline);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionDate48.mmBorrowerStockLendingDeadline, CorporateActionDate55.mmBorrowerStockLendingDeadline, CorporateActionDate64.mmBorrowerStockLendingDeadline,
						CorporateActionDate71.mmBorrowerStockLendingDeadline);
				subType_lazy = () -> Arrays.asList(SecuritiesBlockingDeadline.mmObject(), SecuritiesRegistrationDeadline.mmObject(), MeetingDeadline.mmObject(), CorporateActionDeadline.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deadline.mmRelatedCorporateActionEvent, com.tools20022.repository.entity.Deadline.mmMarketDeadline,
						com.tools20022.repository.entity.Deadline.mmIntermediaryDeadline, com.tools20022.repository.entity.Deadline.mmSTPDeadline, com.tools20022.repository.entity.Deadline.mmRelatedMeeting);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Deadline.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionEvent> getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent == null ? Optional.empty() : Optional.of(relatedCorporateActionEvent);
	}

	public Deadline setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = relatedCorporateActionEvent;
		return this;
	}

	public ISODateTime getMarketDeadline() {
		return marketDeadline;
	}

	public Deadline setMarketDeadline(ISODateTime marketDeadline) {
		this.marketDeadline = Objects.requireNonNull(marketDeadline);
		return this;
	}

	public ISODateTime getIntermediaryDeadline() {
		return intermediaryDeadline;
	}

	public Deadline setIntermediaryDeadline(ISODateTime intermediaryDeadline) {
		this.intermediaryDeadline = Objects.requireNonNull(intermediaryDeadline);
		return this;
	}

	public ISODateTime getSTPDeadline() {
		return sTPDeadline;
	}

	public Deadline setSTPDeadline(ISODateTime sTPDeadline) {
		this.sTPDeadline = Objects.requireNonNull(sTPDeadline);
		return this;
	}

	public Optional<Meeting> getRelatedMeeting() {
		return relatedMeeting == null ? Optional.empty() : Optional.of(relatedMeeting);
	}

	public Deadline setRelatedMeeting(com.tools20022.repository.entity.Meeting relatedMeeting) {
		this.relatedMeeting = relatedMeeting;
		return this;
	}
}