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
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing, netting, reconciliation, trading and/or settlement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="System" src="doc-files/System.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.System#SystemIdentification
 * System.SystemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Location
 * System.Location}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Reconciliation
 * System.Reconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Availability
 * System.Availability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Event System.Event}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#PartyRole
 * System.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Status System.Status}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#SystemGeneratedInformation
 * System.SystemGeneratedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#VersionValidityPeriod
 * System.VersionValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#SystemDateTime
 * System.SystemDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Negotiation
 * System.Negotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Account
 * System.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Trade System.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#Assessment
 * System.Assessment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#TradesPosition
 * System.TradesPosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#SystemLanguage
 * System.SystemLanguage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#System
 * Account.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#System
 * Location.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#System Trade.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#System
 * DateTimePeriod.System}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#IdentificationForSystem
 * SystemIdentification.IdentificationForSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#RelatedSystem
 * SystemPartyRole.RelatedSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#System
 * SystemEventInformation.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#System
 * SystemStatus.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#System
 * SystemAvailability.System}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#System
 * SystemBusinessInformation.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#TradingSystem
 * Negotiation.TradingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#System
 * Reconciliation.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#System
 * Assessment.System}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#System
 * Position.System}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction3#PaymentTo
 * Transaction3.PaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction3#PaymentFrom
 * Transaction3.PaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction4#PaymentTo
 * Transaction4.PaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction4#PaymentFrom
 * Transaction4.PaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction5#PaymentTo
 * Transaction5.PaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction5#PaymentFrom
 * Transaction5.PaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#PaymentTo
 * Transaction24.PaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#PaymentFrom
 * Transaction24.PaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#PaymentTo
 * Transaction33.PaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#PaymentFrom
 * Transaction33.PaymentFrom}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem
 * ClearingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
 * SecuritiesSettlementSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MatchingSystem
 * MatchingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasurySettlementSystem
 * TreasurySettlementSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemDetails1 SystemDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch2 SystemSearch2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch3 SystemSearch3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1
 * SystemAvailabilityAndEventsDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
 * SystemAvailabilityAndEvents1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemDetails2 SystemDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.System1 System1}</li>
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
 * "System"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement."
 * </li>
 * </ul>
 */
public class System extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#IdentificationForSystem
	 * SystemIdentification.IdentificationForSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemDetails1#SystemIdentification
	 * SystemDetails1.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentificationDetails1#SystemIdentification
	 * ReservationIdentificationDetails1.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#SystemIdentification
	 * ReservationIdentification1.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#SystemIdentification
	 * ReservationSearchCriteria1.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#SystemIdentification
	 * ReservationSearchCriteria2.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemSearch3#SystemIdentification
	 * SystemSearch3.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemDetails2#SystemIdentification
	 * SystemDetails2.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.System1#SystemIdentification
	 * System1.SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration1#HostIdentification
	 * AcquirerHostConfiguration1.HostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1#HostIdentification
	 * HostCommunicationParameter1.HostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration1#POIIdentification
	 * AcceptorConfiguration1.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration1#TerminalManagerIdentification
	 * AcceptorConfiguration1.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration2#HostIdentification
	 * AcquirerHostConfiguration2.HostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter2#HostIdentification
	 * HostCommunicationParameter2.HostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#POIIdentification
	 * AcceptorConfiguration2.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#TerminalManagerIdentification
	 * AcceptorConfiguration2.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#POIIdentification
	 * AcceptorConfiguration3.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#TerminalManagerIdentification
	 * AcceptorConfiguration3.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#POIIdentification
	 * AcceptorConfiguration4.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#TerminalManagerIdentification
	 * AcceptorConfiguration4.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration3#HostIdentification
	 * AcquirerHostConfiguration3.HostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter3#HostIdentification
	 * HostCommunicationParameter3.HostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement1#ATM
	 * ATMCompletionAcknowledgement1.ATM}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAcceptorTerminal1#Identification
	 * CardAcceptorTerminal1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration5#TerminalManagerIdentification
	 * AcceptorConfiguration5.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#HostIdentification
	 * HostCommunicationParameter4.HostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#ATM
	 * ATMCompletionAcknowledgement2.ATM}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration6#TerminalManagerIdentification
	 * AcceptorConfiguration6.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4#HostIdentification
	 * AcquirerHostConfiguration4.HostIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystemIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemDetails1.SystemIdentification, com.tools20022.repository.msg.ReservationIdentificationDetails1.SystemIdentification,
					com.tools20022.repository.msg.ReservationIdentification1.SystemIdentification, com.tools20022.repository.msg.ReservationSearchCriteria1.SystemIdentification,
					com.tools20022.repository.msg.ReservationSearchCriteria2.SystemIdentification, com.tools20022.repository.msg.SystemSearch3.SystemIdentification, com.tools20022.repository.msg.SystemDetails2.SystemIdentification,
					com.tools20022.repository.msg.System1.SystemIdentification, com.tools20022.repository.msg.AcquirerHostConfiguration1.HostIdentification, com.tools20022.repository.msg.HostCommunicationParameter1.HostIdentification,
					com.tools20022.repository.msg.AcceptorConfiguration1.POIIdentification, com.tools20022.repository.msg.AcceptorConfiguration1.TerminalManagerIdentification,
					com.tools20022.repository.msg.AcquirerHostConfiguration2.HostIdentification, com.tools20022.repository.msg.HostCommunicationParameter2.HostIdentification,
					com.tools20022.repository.msg.AcceptorConfiguration2.POIIdentification, com.tools20022.repository.msg.AcceptorConfiguration2.TerminalManagerIdentification,
					com.tools20022.repository.msg.AcceptorConfiguration3.POIIdentification, com.tools20022.repository.msg.AcceptorConfiguration3.TerminalManagerIdentification,
					com.tools20022.repository.msg.AcceptorConfiguration4.POIIdentification, com.tools20022.repository.msg.AcceptorConfiguration4.TerminalManagerIdentification,
					com.tools20022.repository.msg.AcquirerHostConfiguration3.HostIdentification, com.tools20022.repository.msg.HostCommunicationParameter3.HostIdentification, com.tools20022.repository.msg.ATMCompletionAcknowledgement1.ATM,
					com.tools20022.repository.msg.CardAcceptorTerminal1.Identification, com.tools20022.repository.msg.AcceptorConfiguration5.TerminalManagerIdentification,
					com.tools20022.repository.msg.HostCommunicationParameter4.HostIdentification, com.tools20022.repository.msg.ATMCompletionAcknowledgement2.ATM,
					com.tools20022.repository.msg.AcceptorConfiguration6.TerminalManagerIdentification, com.tools20022.repository.msg.AcquirerHostConfiguration4.HostIdentification);
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Location, address and country in which the system is located.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Location#System
	 * Location.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch2#Country
	 * SystemSearch2.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3#Location
	 * AutomatedTellerMachine3.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#Location
	 * AutomatedTellerMachine4.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAcceptorTerminal1#Location
	 * CardAcceptorTerminal1.Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#Location
	 * AutomatedTellerMachine10.Location}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location, address and country in which the system is located."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Location = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SystemSearch2.Country, com.tools20022.repository.msg.AutomatedTellerMachine3.Location, com.tools20022.repository.msg.AutomatedTellerMachine4.Location,
					com.tools20022.repository.msg.CardAcceptorTerminal1.Location, com.tools20022.repository.msg.AutomatedTellerMachine10.Location);
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location, address and country in which the system is located.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reconciliation process provided by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#System
	 * Reconciliation.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation process provided by the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Reconciliation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process provided by the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information about the activity or non-activity of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#System
	 * SystemAvailability.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1#ServiceAvailability
	 * ParticipantAndStatus1.ServiceAvailability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the activity or non-activity of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ParticipantAndStatus1.ServiceAvailability);
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Information about the activity or non-activity of the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemAvailability.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specific point in time associated with the system's processing cycle.
	 * Operations of a system are composed of a series of processes, the
	 * closing, or completion, of which constitutes an event with an associated
	 * time stamp. An event may have a series of time stamps associated with it,
	 * such as the scheduled and effective completion times.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#System
	 * SystemEventInformation.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemEventInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#RelatedSystem
	 * SystemPartyRole.RelatedSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
	 * SystemPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#AccountOwner
	 * IntraBalanceCancellation2.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#AccountOwner
	 * IntraBalanceCancellation1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#AccountOwner
	 * IntraBalanceMovement1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#AccountOwner
	 * IntraBalanceMovements1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement1#AccountOwner
	 * IntraPositionMovement1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1#AccountOwner
	 * IntraPositionMovements1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#SafekeepingAccountOwner
	 * IntraPositionQueryCriteria1.SafekeepingAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#AccountOwner
	 * IntraBalanceModification2.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#AccountOwner
	 * IntraBalanceModification1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#CashAccountOwner
	 * IntraBalanceQueryCriteria3.CashAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#AccountOwner
	 * IntraPositionModification2.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1#AccountOwner
	 * IntraPositionModification1.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation2#AccountOwner
	 * IntraPositionCancellation2.AccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1#AccountOwner
	 * IntraPositionCancellation1.AccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each role linked to a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceCancellation2.AccountOwner, com.tools20022.repository.msg.IntraBalanceCancellation1.AccountOwner,
					com.tools20022.repository.msg.IntraBalanceMovement1.AccountOwner, com.tools20022.repository.msg.IntraBalanceMovements1.AccountOwner, com.tools20022.repository.msg.IntraPositionMovement1.AccountOwner,
					com.tools20022.repository.msg.IntraPositionMovements1.AccountOwner, com.tools20022.repository.msg.IntraPositionQueryCriteria1.SafekeepingAccountOwner,
					com.tools20022.repository.msg.IntraBalanceModification2.AccountOwner, com.tools20022.repository.msg.IntraBalanceModification1.AccountOwner, com.tools20022.repository.msg.IntraBalanceQueryCriteria3.CashAccountOwner,
					com.tools20022.repository.msg.IntraPositionModification2.AccountOwner, com.tools20022.repository.msg.IntraPositionModification1.AccountOwner, com.tools20022.repository.msg.IntraPositionCancellation2.AccountOwner,
					com.tools20022.repository.msg.IntraPositionCancellation1.AccountOwner);
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a system.";
			minOccurs = 0;
			type_lazy = () -> SystemPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.RelatedSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Status of the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#System
	 * SystemStatus.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemStatus
	 * SystemStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#ATMRequiredGlobalStatus
	 * ATMCommandParameters1Choice.ATMRequiredGlobalStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Status = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ATMCommandParameters1Choice.ATMRequiredGlobalStatus);
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Business details provided for an information system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#System
	 * SystemBusinessInformation.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemGeneratedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business details provided for an information system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SystemGeneratedInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemGeneratedInformation";
			definition = "Business details provided for an information system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SystemBusinessInformation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date at, or period of time during which, the stipulated version is in
	 * effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#System
	 * DateTimePeriod.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at, or period of time during which, the stipulated version is in effect."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd VersionValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VersionValidityPeriod";
			definition = "Date at, or period of time during which, the stipulated version is in effect.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date time of a system performing a task.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time of a system performing a task."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SystemDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemDateTime";
			definition = "Date time of a system performing a task.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Negotiation process which uses a ssystem.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#TradingSystem
	 * Negotiation.TradingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Negotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiation process which uses a ssystem."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Negotiation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Negotiation";
			definition = "Negotiation process which uses a ssystem.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.TradingSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account managed by a system and held by a system member.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#System
	 * Account.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account managed by a system and held by a system member."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account managed by a system and held by a system member.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade processed by a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#System
	 * Trade.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade processed by a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade processed by a system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Assessment associated with a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assessment#System
	 * Assessment.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Assessment
	 * Assessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assessment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assessment associated with a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Assessment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Assessment";
			definition = "Assessment associated with a system.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Assessment.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of trades and their value inside a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Position#System
	 * Position.System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradesPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of trades and their value inside a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TradesPosition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradesPosition";
			definition = "Specifies the status of trades and their value inside a system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.System;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the language used by the system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the language used by the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SystemLanguage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> System.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemLanguage";
			definition = "Specifies the language used by the system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "System";
				definition = "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.System, com.tools20022.repository.entity.Location.System, com.tools20022.repository.entity.Trade.System,
						com.tools20022.repository.entity.DateTimePeriod.System, com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem, com.tools20022.repository.entity.SystemPartyRole.RelatedSystem,
						com.tools20022.repository.entity.SystemEventInformation.System, com.tools20022.repository.entity.SystemStatus.System, com.tools20022.repository.entity.SystemAvailability.System,
						com.tools20022.repository.entity.SystemBusinessInformation.System, com.tools20022.repository.entity.Negotiation.TradingSystem, com.tools20022.repository.entity.Reconciliation.System,
						com.tools20022.repository.entity.Assessment.System, com.tools20022.repository.entity.Position.System);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transaction3.PaymentTo, com.tools20022.repository.msg.Transaction3.PaymentFrom, com.tools20022.repository.msg.Transaction4.PaymentTo,
						com.tools20022.repository.msg.Transaction4.PaymentFrom, com.tools20022.repository.msg.Transaction5.PaymentTo, com.tools20022.repository.msg.Transaction5.PaymentFrom,
						com.tools20022.repository.msg.Transaction24.PaymentTo, com.tools20022.repository.msg.Transaction24.PaymentFrom, com.tools20022.repository.msg.Transaction33.PaymentTo,
						com.tools20022.repository.msg.Transaction33.PaymentFrom);
				subType_lazy = () -> Arrays.asList(ClearingSystem.mmObject(), SecuritiesSettlementSystem.mmObject(), PointOfInteraction.mmObject(), TerminalManagementSystem.mmObject(), MatchingSystem.mmObject(),
						TreasurySettlementSystem.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.SystemIdentification, com.tools20022.repository.entity.System.Location, com.tools20022.repository.entity.System.Reconciliation,
						com.tools20022.repository.entity.System.Availability, com.tools20022.repository.entity.System.Event, com.tools20022.repository.entity.System.PartyRole, com.tools20022.repository.entity.System.Status,
						com.tools20022.repository.entity.System.SystemGeneratedInformation, com.tools20022.repository.entity.System.VersionValidityPeriod, com.tools20022.repository.entity.System.SystemDateTime,
						com.tools20022.repository.entity.System.Negotiation, com.tools20022.repository.entity.System.Account, com.tools20022.repository.entity.System.Trade, com.tools20022.repository.entity.System.Assessment,
						com.tools20022.repository.entity.System.TradesPosition, com.tools20022.repository.entity.System.SystemLanguage);
				derivationComponent_lazy = () -> Arrays.asList(SystemDetails1.mmObject(), SystemSearch2.mmObject(), SystemSearch3.mmObject(), SystemAvailabilityAndEventsDetails1.mmObject(), SystemAvailabilityAndEvents1.mmObject(),
						SystemDetails2.mmObject(), System1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}