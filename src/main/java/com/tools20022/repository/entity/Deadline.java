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
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.Deadline#RelatedCorporateActionEvent
 * Deadline.RelatedCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#MarketDeadline
 * Deadline.MarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Deadline#IntermediaryDeadline
 * Deadline.IntermediaryDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#STPDeadline
 * Deadline.STPDeadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deadline#RelatedMeeting
 * Deadline.RelatedMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Deadline
 * CorporateActionEvent.Deadline}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#Deadline
 * Meeting.Deadline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#BorrowerStockLendingDeadline
 * CorporateActionDate48.BorrowerStockLendingDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#BorrowerStockLendingDeadline
 * CorporateActionDate55.BorrowerStockLendingDeadline}</li>
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
	/**
	 * Related corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Deadline
	 * CorporateActionEvent.Deadline}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Related corporate action event.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Deadline;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#MarketDeadline
	 * CorporateActionDate6.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#MarketDeadline
	 * CorporateActionDate10.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#MarketDeadline
	 * CorporateActionDate18.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#MarketDeadline
	 * CorporateActionDate19.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#MarketDeadline
	 * CorporateActionDate8.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#MarketDeadline
	 * CorporateActionDate11.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#MarketDeadline
	 * CorporateActionDate15.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#MarketDeadline
	 * CorporateActionDate16.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#ProxyAppointmentMarketDeadline
	 * ProxyParameters.ProxyAppointmentMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#AttendanceConfirmationMarketDeadline
	 * MeetingNotice1.AttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#ResolutionProposalMarketDeadline
	 * MeetingNotice1.ResolutionProposalMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#VoteMarketDeadline
	 * VoteParameters.VoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#VoteWithPremiumMarketDeadline
	 * VoteParameters.VoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#SecuritiesBlockingMarketDeadline
	 * EntitlementAssessment.SecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#SecuritiesReregistrationMarketDeadline
	 * EntitlementAssessment.SecuritiesReregistrationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#MarketDeadline
	 * ProxyAppointmentInformation1.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#AttendanceConfirmationMarketDeadline
	 * MeetingNotice2.AttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ResolutionProposalMarketDeadline
	 * MeetingNotice2.ResolutionProposalMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteMarketDeadline
	 * VoteParameters1.VoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#RevocabilityMarketDeadline
	 * VoteParameters1.RevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteWithPremiumMarketDeadline
	 * VoteParameters1.VoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#SecuritiesBlockingMarketDeadline
	 * EntitlementAssessment1.SecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#RegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment1.RegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#RegistrationParticipationMarketDeadline
	 * EntitlementAssessment1.RegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights1#AdditionalRightMarketDeadline
	 * AdditionalRights1.AdditionalRightMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#MarketDeadline
	 * ProxyAppointmentInformation2.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AttendanceConfirmationMarketDeadline
	 * MeetingNotice3.AttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteMarketDeadline
	 * VoteParameters2.VoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#RevocabilityMarketDeadline
	 * VoteParameters2.RevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteWithPremiumMarketDeadline
	 * VoteParameters2.VoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#SecuritiesBlockingMarketDeadline
	 * EntitlementAssessment2.SecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#RegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment2.RegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#RegistrationParticipationMarketDeadline
	 * EntitlementAssessment2.RegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteMarketDeadline
	 * VoteParameters3.VoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#RevocabilityMarketDeadline
	 * VoteParameters3.RevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteWithPremiumMarketDeadline
	 * VoteParameters3.VoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#MarketDeadline
	 * CorporateActionDate4.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption11#MarketDeadline
	 * CorporateActionOption11.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#MarketDeadline
	 * CorporateActionDate29.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#MarketDeadline
	 * CorporateActionDate33.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#SecuritiesBlockingMarketDeadline
	 * EntitlementAssessment3.SecuritiesBlockingMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#RegistrationSecuritiesMarketDeadline
	 * EntitlementAssessment3.RegistrationSecuritiesMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#RegistrationParticipationMarketDeadline
	 * EntitlementAssessment3.RegistrationParticipationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteMarketDeadline
	 * VoteParameters4.VoteMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#RevocabilityMarketDeadline
	 * VoteParameters4.RevocabilityMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteWithPremiumMarketDeadline
	 * VoteParameters4.VoteWithPremiumMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AttendanceConfirmationMarketDeadline
	 * MeetingNotice4.AttendanceConfirmationMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#MarketDeadline
	 * ProxyAppointmentInformation3.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalRights2#AdditionalRightMarketDeadline
	 * AdditionalRights2.AdditionalRightMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#MarketDeadline
	 * CorporateActionDate46.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#MarketDeadline
	 * CorporateActionDate48.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#MarketDeadline
	 * CorporateActionDate52.MarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#MarketDeadline
	 * CorporateActionDate55.MarketDeadline}</li>
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
	 * "Date by which the action should have been completed.  This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarketDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate10.MarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate18.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate19.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate8.MarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate11.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate15.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate16.MarketDeadline,
					com.tools20022.repository.msg.ProxyParameters.ProxyAppointmentMarketDeadline, com.tools20022.repository.msg.MeetingNotice1.AttendanceConfirmationMarketDeadline,
					com.tools20022.repository.msg.MeetingNotice1.ResolutionProposalMarketDeadline, com.tools20022.repository.msg.VoteParameters.VoteMarketDeadline, com.tools20022.repository.msg.VoteParameters.VoteWithPremiumMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment.SecuritiesBlockingMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment.SecuritiesReregistrationMarketDeadline,
					com.tools20022.repository.msg.ProxyAppointmentInformation1.MarketDeadline, com.tools20022.repository.msg.MeetingNotice2.AttendanceConfirmationMarketDeadline,
					com.tools20022.repository.msg.MeetingNotice2.ResolutionProposalMarketDeadline, com.tools20022.repository.msg.VoteParameters1.VoteMarketDeadline, com.tools20022.repository.msg.VoteParameters1.RevocabilityMarketDeadline,
					com.tools20022.repository.msg.VoteParameters1.VoteWithPremiumMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment1.SecuritiesBlockingMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment1.RegistrationSecuritiesMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment1.RegistrationParticipationMarketDeadline,
					com.tools20022.repository.msg.AdditionalRights1.AdditionalRightMarketDeadline, com.tools20022.repository.msg.ProxyAppointmentInformation2.MarketDeadline,
					com.tools20022.repository.msg.MeetingNotice3.AttendanceConfirmationMarketDeadline, com.tools20022.repository.msg.VoteParameters2.VoteMarketDeadline,
					com.tools20022.repository.msg.VoteParameters2.RevocabilityMarketDeadline, com.tools20022.repository.msg.VoteParameters2.VoteWithPremiumMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.SecuritiesBlockingMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment2.RegistrationSecuritiesMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.RegistrationParticipationMarketDeadline, com.tools20022.repository.msg.VoteParameters3.VoteMarketDeadline,
					com.tools20022.repository.msg.VoteParameters3.RevocabilityMarketDeadline, com.tools20022.repository.msg.VoteParameters3.VoteWithPremiumMarketDeadline, com.tools20022.repository.msg.CorporateActionDate4.MarketDeadline,
					com.tools20022.repository.msg.CorporateActionOption11.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate29.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate33.MarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.SecuritiesBlockingMarketDeadline, com.tools20022.repository.msg.EntitlementAssessment3.RegistrationSecuritiesMarketDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.RegistrationParticipationMarketDeadline, com.tools20022.repository.msg.VoteParameters4.VoteMarketDeadline,
					com.tools20022.repository.msg.VoteParameters4.RevocabilityMarketDeadline, com.tools20022.repository.msg.VoteParameters4.VoteWithPremiumMarketDeadline,
					com.tools20022.repository.msg.MeetingNotice4.AttendanceConfirmationMarketDeadline, com.tools20022.repository.msg.ProxyAppointmentInformation3.MarketDeadline,
					com.tools20022.repository.msg.AdditionalRights2.AdditionalRightMarketDeadline, com.tools20022.repository.msg.CorporateActionDate46.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate48.MarketDeadline,
					com.tools20022.repository.msg.CorporateActionDate52.MarketDeadline, com.tools20022.repository.msg.CorporateActionDate55.MarketDeadline);
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketDeadline";
			definition = "Date by which the action should have been completed.  This deadline is set by the issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by an intermediary.
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
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#ProxyAppointmentDeadline
	 * ProxyParameters.ProxyAppointmentDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#AttendanceConfirmationDeadline
	 * MeetingNotice1.AttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#ResolutionProposalDeadline
	 * MeetingNotice1.ResolutionProposalDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#VoteDeadline
	 * VoteParameters.VoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#VoteWithPremiumDeadline
	 * VoteParameters.VoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#SecuritiesBlockingDeadline
	 * EntitlementAssessment.SecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment#SecuritiesReregistrationDeadline
	 * EntitlementAssessment.SecuritiesReregistrationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#AttendanceConfirmationDeadline
	 * MeetingNotice2.AttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ResolutionProposalDeadline
	 * MeetingNotice2.ResolutionProposalDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteDeadline
	 * VoteParameters1.VoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#RevocabilityDeadline
	 * VoteParameters1.RevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteWithPremiumDeadline
	 * VoteParameters1.VoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#SecuritiesBlockingDeadline
	 * EntitlementAssessment1.SecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#RegistrationSecuritiesDeadline
	 * EntitlementAssessment1.RegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#RegistrationParticipationDeadline
	 * EntitlementAssessment1.RegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AttendanceConfirmationDeadline
	 * MeetingNotice3.AttendanceConfirmationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteDeadline
	 * VoteParameters2.VoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#RevocabilityDeadline
	 * VoteParameters2.RevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteWithPremiumDeadline
	 * VoteParameters2.VoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#SecuritiesBlockingDeadline
	 * EntitlementAssessment2.SecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#RegistrationSecuritiesDeadline
	 * EntitlementAssessment2.RegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#RegistrationParticipationDeadline
	 * EntitlementAssessment2.RegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteDeadline
	 * VoteParameters3.VoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#RevocabilityDeadline
	 * VoteParameters3.RevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteWithPremiumDeadline
	 * VoteParameters3.VoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#SecuritiesBlockingDeadline
	 * EntitlementAssessment3.SecuritiesBlockingDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#RegistrationSecuritiesDeadline
	 * EntitlementAssessment3.RegistrationSecuritiesDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#RegistrationParticipationDeadline
	 * EntitlementAssessment3.RegistrationParticipationDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteDeadline
	 * VoteParameters4.VoteDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#RevocabilityDeadline
	 * VoteParameters4.RevocabilityDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#EarlyVoteWithPremiumDeadline
	 * VoteParameters4.EarlyVoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteWithPremiumDeadline
	 * VoteParameters4.VoteWithPremiumDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AttendanceConfirmationDeadline
	 * MeetingNotice4.AttendanceConfirmationDeadline}</li>
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
	public static final MMBusinessAttribute IntermediaryDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyParameters.ProxyAppointmentDeadline, com.tools20022.repository.msg.MeetingNotice1.AttendanceConfirmationDeadline,
					com.tools20022.repository.msg.MeetingNotice1.ResolutionProposalDeadline, com.tools20022.repository.msg.VoteParameters.VoteDeadline, com.tools20022.repository.msg.VoteParameters.VoteWithPremiumDeadline,
					com.tools20022.repository.msg.EntitlementAssessment.SecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment.SecuritiesReregistrationDeadline,
					com.tools20022.repository.msg.MeetingNotice2.AttendanceConfirmationDeadline, com.tools20022.repository.msg.MeetingNotice2.ResolutionProposalDeadline, com.tools20022.repository.msg.VoteParameters1.VoteDeadline,
					com.tools20022.repository.msg.VoteParameters1.RevocabilityDeadline, com.tools20022.repository.msg.VoteParameters1.VoteWithPremiumDeadline, com.tools20022.repository.msg.EntitlementAssessment1.SecuritiesBlockingDeadline,
					com.tools20022.repository.msg.EntitlementAssessment1.RegistrationSecuritiesDeadline, com.tools20022.repository.msg.EntitlementAssessment1.RegistrationParticipationDeadline,
					com.tools20022.repository.msg.MeetingNotice3.AttendanceConfirmationDeadline, com.tools20022.repository.msg.VoteParameters2.VoteDeadline, com.tools20022.repository.msg.VoteParameters2.RevocabilityDeadline,
					com.tools20022.repository.msg.VoteParameters2.VoteWithPremiumDeadline, com.tools20022.repository.msg.EntitlementAssessment2.SecuritiesBlockingDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.RegistrationSecuritiesDeadline, com.tools20022.repository.msg.EntitlementAssessment2.RegistrationParticipationDeadline,
					com.tools20022.repository.msg.VoteParameters3.VoteDeadline, com.tools20022.repository.msg.VoteParameters3.RevocabilityDeadline, com.tools20022.repository.msg.VoteParameters3.VoteWithPremiumDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.SecuritiesBlockingDeadline, com.tools20022.repository.msg.EntitlementAssessment3.RegistrationSecuritiesDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.RegistrationParticipationDeadline, com.tools20022.repository.msg.VoteParameters4.VoteDeadline, com.tools20022.repository.msg.VoteParameters4.RevocabilityDeadline,
					com.tools20022.repository.msg.VoteParameters4.EarlyVoteWithPremiumDeadline, com.tools20022.repository.msg.VoteParameters4.VoteWithPremiumDeadline,
					com.tools20022.repository.msg.MeetingNotice4.AttendanceConfirmationDeadline);
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediaryDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by an intermediary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date by which the action should have been completed. This deadline is set
	 * by the issuer. (STP or Electronic mode)
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
	 * {@linkplain com.tools20022.repository.msg.ProxyParameters#ProxyAppointmentElectronicDeadline
	 * ProxyParameters.ProxyAppointmentElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#AttendanceConfirmationElectronicDeadline
	 * MeetingNotice1.AttendanceConfirmationElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#VoteElectronicDeadline
	 * VoteParameters.VoteElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters#VoteWithPremiumElectronicDeadline
	 * VoteParameters.VoteWithPremiumElectronicDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#AttendanceConfirmationSTPDeadline
	 * MeetingNotice2.AttendanceConfirmationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteSTPDeadline
	 * VoteParameters1.VoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#RevocabilitySTPDeadline
	 * VoteParameters1.RevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters1#VoteWithPremiumSTPDeadline
	 * VoteParameters1.VoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#SecuritiesBlockingSTPDeadline
	 * EntitlementAssessment1.SecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#RegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment1.RegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1#RegistrationParticipationSTPDeadline
	 * EntitlementAssessment1.RegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#AttendanceConfirmationSTPDeadline
	 * MeetingNotice3.AttendanceConfirmationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteSTPDeadline
	 * VoteParameters2.VoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#RevocabilitySTPDeadline
	 * VoteParameters2.RevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters2#VoteWithPremiumSTPDeadline
	 * VoteParameters2.VoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#SecuritiesBlockingSTPDeadline
	 * EntitlementAssessment2.SecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#RegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment2.RegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2#RegistrationParticipationSTPDeadline
	 * EntitlementAssessment2.RegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteSTPDeadline
	 * VoteParameters3.VoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#RevocabilitySTPDeadline
	 * VoteParameters3.RevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters3#VoteWithPremiumSTPDeadline
	 * VoteParameters3.VoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#SecuritiesBlockingSTPDeadline
	 * EntitlementAssessment3.SecuritiesBlockingSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#RegistrationSecuritiesSTPDeadline
	 * EntitlementAssessment3.RegistrationSecuritiesSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3#RegistrationParticipationSTPDeadline
	 * EntitlementAssessment3.RegistrationParticipationSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteSTPDeadline
	 * VoteParameters4.VoteSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#RevocabilitySTPDeadline
	 * VoteParameters4.RevocabilitySTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteParameters4#VoteWithPremiumSTPDeadline
	 * VoteParameters4.VoteWithPremiumSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#AttendanceConfirmationSTPDeadline
	 * MeetingNotice4.AttendanceConfirmationSTPDeadline}</li>
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
	 * "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute STPDeadline = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyParameters.ProxyAppointmentElectronicDeadline, com.tools20022.repository.msg.MeetingNotice1.AttendanceConfirmationElectronicDeadline,
					com.tools20022.repository.msg.VoteParameters.VoteElectronicDeadline, com.tools20022.repository.msg.VoteParameters.VoteWithPremiumElectronicDeadline,
					com.tools20022.repository.msg.MeetingNotice2.AttendanceConfirmationSTPDeadline, com.tools20022.repository.msg.VoteParameters1.VoteSTPDeadline, com.tools20022.repository.msg.VoteParameters1.RevocabilitySTPDeadline,
					com.tools20022.repository.msg.VoteParameters1.VoteWithPremiumSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment1.SecuritiesBlockingSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment1.RegistrationSecuritiesSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment1.RegistrationParticipationSTPDeadline,
					com.tools20022.repository.msg.MeetingNotice3.AttendanceConfirmationSTPDeadline, com.tools20022.repository.msg.VoteParameters2.VoteSTPDeadline, com.tools20022.repository.msg.VoteParameters2.RevocabilitySTPDeadline,
					com.tools20022.repository.msg.VoteParameters2.VoteWithPremiumSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment2.SecuritiesBlockingSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment2.RegistrationSecuritiesSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment2.RegistrationParticipationSTPDeadline,
					com.tools20022.repository.msg.VoteParameters3.VoteSTPDeadline, com.tools20022.repository.msg.VoteParameters3.RevocabilitySTPDeadline, com.tools20022.repository.msg.VoteParameters3.VoteWithPremiumSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.SecuritiesBlockingSTPDeadline, com.tools20022.repository.msg.EntitlementAssessment3.RegistrationSecuritiesSTPDeadline,
					com.tools20022.repository.msg.EntitlementAssessment3.RegistrationParticipationSTPDeadline, com.tools20022.repository.msg.VoteParameters4.VoteSTPDeadline,
					com.tools20022.repository.msg.VoteParameters4.RevocabilitySTPDeadline, com.tools20022.repository.msg.VoteParameters4.VoteWithPremiumSTPDeadline,
					com.tools20022.repository.msg.MeetingNotice4.AttendanceConfirmationSTPDeadline);
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "STPDeadline";
			definition = "Date by which the action should have been completed. This deadline is set by the issuer. (STP or Electronic mode)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Meeting for which deadlines are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#Deadline
	 * Meeting.Deadline}</li>
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
	public static final MMBusinessAssociationEnd RelatedMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Deadline.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedMeeting";
			definition = "Meeting for which deadlines are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Meeting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.Deadline;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Deadline";
				definition = "Specifies the different deadlines available for the different processes related to corporate action processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.Deadline, com.tools20022.repository.entity.Meeting.Deadline);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate48.BorrowerStockLendingDeadline, com.tools20022.repository.msg.CorporateActionDate55.BorrowerStockLendingDeadline);
				subType_lazy = () -> Arrays.asList(SecuritiesBlockingDeadline.mmObject(), SecuritiesRegistrationDeadline.mmObject(), MeetingDeadline.mmObject(), CorporateActionDeadline.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Deadline.RelatedCorporateActionEvent, com.tools20022.repository.entity.Deadline.MarketDeadline,
						com.tools20022.repository.entity.Deadline.IntermediaryDeadline, com.tools20022.repository.entity.Deadline.STPDeadline, com.tools20022.repository.entity.Deadline.RelatedMeeting);
			}
		});
		return mmObject_lazy.get();
	}
}