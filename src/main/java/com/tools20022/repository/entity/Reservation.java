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
import com.tools20022.repository.codeset.ReservationTypeCode;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Liquidity set aside by the payer for specific purposes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reservation" src="doc-files/Reservation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Reservation#ReservationType
 * Reservation.ReservationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#RelatedIntraPositionTransfer
 * Reservation.RelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#SettlementInstruction
 * Reservation.SettlementInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reservation#AccountService
 * Reservation.AccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountService#Reservation
 * AccountService.Reservation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#Reservation
 * CashSettlement.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#Reservation
 * IntraPositionTransfer.Reservation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#ReservationIdentification
 * ReservationIdentification1.ReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1#SearchCriteria
 * ReservationCriteria1.SearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationCriteria2#SearchCriteria
 * ReservationCriteria2.SearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice#Current
 * CurrentOrDefaultReservation1Choice.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice#Default
 * CurrentOrDefaultReservation1Choice.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport1#ReservationIdentification
 * ReservationReport1.ReservationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationReport1#Reservation
 * ReservationReport1.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations1#CurrentReservation
 * Reservations1.CurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations1#DefaultReservation
 * Reservations1.DefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport2#ReservationIdentification
 * ReservationReport2.ReservationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationReport2#Reservation
 * ReservationReport2.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations2#CurrentReservation
 * Reservations2.CurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations2#DefaultReservation
 * Reservations2.DefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError3Choice#Reservation
 * ReservationOrError3Choice.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport3#ReservationIdentification
 * ReservationReport3.ReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#CurrentReservation
 * CurrentAndDefaultReservation1.CurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#DefaultReservation
 * CurrentAndDefaultReservation1.DefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError2Choice#BusinessReport
 * ReservationOrError2Choice.BusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError4Choice#BusinessReport
 * ReservationOrError4Choice.BusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#CurrentReservation
 * CurrentAndDefaultReservation2.CurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#DefaultReservation
 * CurrentAndDefaultReservation2.DefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError5Choice#Reservation
 * ReservationOrError5Choice.Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport4#ReservationIdentification
 * ReservationReport4.ReservationIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationIdentificationDetails1
 * ReservationIdentificationDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReservationType1Choice
 * ReservationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationIdentification1
 * ReservationIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1
 * ReservationSearchCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationCriteria1
 * ReservationCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2
 * ReservationSearchCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationCriteria2
 * ReservationCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationDetails2
 * ReservationDetails2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice
 * CurrentOrDefaultReservation1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reservation2 Reservation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationDetails1
 * ReservationDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationReport1
 * ReservationReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reservations1 Reservations1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationReport2
 * ReservationReport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reservations2 Reservations2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReservationStatus1Choice
 * ReservationStatus1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Reservation1 Reservation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReservationOrError3Choice
 * ReservationOrError3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationReport3
 * ReservationReport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1
 * CurrentAndDefaultReservation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReservationOrError2Choice
 * ReservationOrError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReservationOrError4Choice
 * ReservationOrError4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2
 * CurrentAndDefaultReservation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ReservationOrError5Choice
 * ReservationOrError5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationReport4
 * ReservationReport4}</li>
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
 * "Reservation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Liquidity set aside by the payer for specific purposes."</li>
 * </ul>
 */
public class Reservation extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Nature of the reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReservationTypeCode
	 * ReservationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentificationDetails1#Type
	 * ReservationIdentificationDetails1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationType1Choice#Code
	 * ReservationType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationType1Choice#Proprietary
	 * ReservationType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#Type
	 * ReservationIdentification1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#DefaultReservationType
	 * ReservationSearchCriteria1.DefaultReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#CurrentReservationType
	 * ReservationSearchCriteria1.CurrentReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#DefaultReservationType
	 * ReservationSearchCriteria2.DefaultReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#CurrentReservationType
	 * ReservationSearchCriteria2.CurrentReservationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the reservation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReservationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReservationIdentificationDetails1.Type, com.tools20022.repository.choice.ReservationType1Choice.Code,
					com.tools20022.repository.choice.ReservationType1Choice.Proprietary, com.tools20022.repository.msg.ReservationIdentification1.Type, com.tools20022.repository.msg.ReservationSearchCriteria1.DefaultReservationType,
					com.tools20022.repository.msg.ReservationSearchCriteria1.CurrentReservationType, com.tools20022.repository.msg.ReservationSearchCriteria2.DefaultReservationType,
					com.tools20022.repository.msg.ReservationSearchCriteria2.CurrentReservationType);
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReservationType";
			definition = "Nature of the reservation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReservationTypeCode.mmObject();
		}
	};
	/**
	 * Transfer process for which reservation information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#Reservation
	 * IntraPositionTransfer.Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
	 * IntraPositionTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedIntraPositionTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process for which reservation information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer process for which reservation information is provided.";
			minOccurs = 0;
			type_lazy = () -> IntraPositionTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the instruction which originated the reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#Reservation
	 * CashSettlement.Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the instruction which originated the reservation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the instruction which originated the reservation.";
			minOccurs = 0;
			type_lazy = () -> CashSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account services for which reservation information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#Reservation
	 * AccountService.Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountService
	 * AccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account services for which reservation information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Account services for which reservation information is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.Reservation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Reservation";
				definition = "Liquidity set aside by the payer for specific purposes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountService.Reservation, com.tools20022.repository.entity.CashSettlement.Reservation,
						com.tools20022.repository.entity.IntraPositionTransfer.Reservation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReservationIdentification1.ReservationIdentification, com.tools20022.repository.msg.ReservationCriteria1.SearchCriteria,
						com.tools20022.repository.msg.ReservationCriteria2.SearchCriteria, com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice.Current,
						com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice.Default, com.tools20022.repository.msg.ReservationReport1.ReservationIdentification, com.tools20022.repository.msg.ReservationReport1.Reservation,
						com.tools20022.repository.msg.Reservations1.CurrentReservation, com.tools20022.repository.msg.Reservations1.DefaultReservation, com.tools20022.repository.msg.ReservationReport2.ReservationIdentification,
						com.tools20022.repository.msg.ReservationReport2.Reservation, com.tools20022.repository.msg.Reservations2.CurrentReservation, com.tools20022.repository.msg.Reservations2.DefaultReservation,
						com.tools20022.repository.choice.ReservationOrError3Choice.Reservation, com.tools20022.repository.msg.ReservationReport3.ReservationIdentification,
						com.tools20022.repository.msg.CurrentAndDefaultReservation1.CurrentReservation, com.tools20022.repository.msg.CurrentAndDefaultReservation1.DefaultReservation,
						com.tools20022.repository.choice.ReservationOrError2Choice.BusinessReport, com.tools20022.repository.choice.ReservationOrError4Choice.BusinessReport,
						com.tools20022.repository.msg.CurrentAndDefaultReservation2.CurrentReservation, com.tools20022.repository.msg.CurrentAndDefaultReservation2.DefaultReservation,
						com.tools20022.repository.choice.ReservationOrError5Choice.Reservation, com.tools20022.repository.msg.ReservationReport4.ReservationIdentification);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reservation.ReservationType, com.tools20022.repository.entity.Reservation.RelatedIntraPositionTransfer,
						com.tools20022.repository.entity.Reservation.SettlementInstruction, com.tools20022.repository.entity.Reservation.AccountService);
				derivationComponent_lazy = () -> Arrays.asList(ReservationIdentificationDetails1.mmObject(), ReservationType1Choice.mmObject(), ReservationIdentification1.mmObject(), ReservationSearchCriteria1.mmObject(),
						ReservationCriteria1.mmObject(), ReservationSearchCriteria2.mmObject(), ReservationCriteria2.mmObject(), ReservationDetails2.mmObject(), CurrentOrDefaultReservation1Choice.mmObject(), Reservation2.mmObject(),
						ReservationDetails1.mmObject(), ReservationReport1.mmObject(), Reservations1.mmObject(), ReservationReport2.mmObject(), Reservations2.mmObject(), ReservationStatus1Choice.mmObject(), Reservation1.mmObject(),
						ReservationOrError3Choice.mmObject(), ReservationReport3.mmObject(), CurrentAndDefaultReservation1.mmObject(), ReservationOrError2Choice.mmObject(), ReservationOrError4Choice.mmObject(),
						CurrentAndDefaultReservation2.mmObject(), ReservationOrError5Choice.mmObject(), ReservationReport4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}