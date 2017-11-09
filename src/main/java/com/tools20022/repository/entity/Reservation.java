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
import com.tools20022.repository.codeset.ReservationTypeCode;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Liquidity set aside by the payer for specific purposes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reservation" src="doc-files/Reservation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountService#mmReservation
 * AccountService.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
 * CashSettlement.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmReservation
 * IntraPositionTransfer.mmReservation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#mmReservationIdentification
 * ReservationIdentification1.mmReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationCriteria1#mmSearchCriteria
 * ReservationCriteria1.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationCriteria2#mmSearchCriteria
 * ReservationCriteria2.mmSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice#mmCurrent
 * CurrentOrDefaultReservation1Choice.mmCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice#mmDefault
 * CurrentOrDefaultReservation1Choice.mmDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport1#mmReservationIdentification
 * ReservationReport1.mmReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport1#mmReservation
 * ReservationReport1.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations1#mmCurrentReservation
 * Reservations1.mmCurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations1#mmDefaultReservation
 * Reservations1.mmDefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport2#mmReservationIdentification
 * ReservationReport2.mmReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport2#mmReservation
 * ReservationReport2.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations2#mmCurrentReservation
 * Reservations2.mmCurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Reservations2#mmDefaultReservation
 * Reservations2.mmDefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError3Choice#mmReservation
 * ReservationOrError3Choice.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport3#mmReservationIdentification
 * ReservationReport3.mmReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#mmCurrentReservation
 * CurrentAndDefaultReservation1.mmCurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#mmDefaultReservation
 * CurrentAndDefaultReservation1.mmDefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError2Choice#mmBusinessReport
 * ReservationOrError2Choice.mmBusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError4Choice#mmBusinessReport
 * ReservationOrError4Choice.mmBusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmCurrentReservation
 * CurrentAndDefaultReservation2.mmCurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmDefaultReservation
 * CurrentAndDefaultReservation2.mmDefaultReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError5Choice#mmReservation
 * ReservationOrError5Choice.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport4#mmReservationIdentification
 * ReservationReport4.mmReservationIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmReservationType
 * Reservation.mmReservationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmRelatedIntraPositionTransfer
 * Reservation.mmRelatedIntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmSettlementInstruction
 * Reservation.mmSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reservation#mmAccountService
 * Reservation.mmAccountService}</li>
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
 * "Reservation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Liquidity set aside by the payer for specific purposes."</li>
 * </ul>
 */
public class Reservation extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ReservationTypeCode reservationType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentificationDetails1#mmType
	 * ReservationIdentificationDetails1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationType1Choice#mmCode
	 * ReservationType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationType1Choice#mmProprietary
	 * ReservationType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#mmType
	 * ReservationIdentification1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#mmDefaultReservationType
	 * ReservationSearchCriteria1.mmDefaultReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#mmCurrentReservationType
	 * ReservationSearchCriteria1.mmCurrentReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmDefaultReservationType
	 * ReservationSearchCriteria2.mmDefaultReservationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmCurrentReservationType
	 * ReservationSearchCriteria2.mmCurrentReservationType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmReservationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ReservationIdentificationDetails1.mmType, ReservationType1Choice.mmCode, ReservationType1Choice.mmProprietary, ReservationIdentification1.mmType,
					ReservationSearchCriteria1.mmDefaultReservationType, ReservationSearchCriteria1.mmCurrentReservationType, ReservationSearchCriteria2.mmDefaultReservationType, ReservationSearchCriteria2.mmCurrentReservationType);
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReservationType";
			definition = "Nature of the reservation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReservationTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.IntraPositionTransfer> relatedIntraPositionTransfer;
	/**
	 * Transfer process for which reservation information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmReservation
	 * IntraPositionTransfer.mmReservation}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedIntraPositionTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedIntraPositionTransfer";
			definition = "Transfer process for which reservation information is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmReservation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.IntraPositionTransfer.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashSettlement> settlementInstruction;
	/**
	 * Specifies the instruction which originated the reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmReservation
	 * CashSettlement.mmReservation}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementInstruction";
			definition = "Specifies the instruction which originated the reservation.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmReservation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};
	protected AccountService accountService;
	/**
	 * Account services for which reservation information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountService#mmReservation
	 * AccountService.mmReservation}</li>
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
	public static final MMBusinessAssociationEnd mmAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Reservation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountService";
			definition = "Account services for which reservation information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AccountService.mmReservation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AccountService.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reservation";
				definition = "Liquidity set aside by the payer for specific purposes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountService.mmReservation, com.tools20022.repository.entity.CashSettlement.mmReservation,
						com.tools20022.repository.entity.IntraPositionTransfer.mmReservation);
				derivationElement_lazy = () -> Arrays.asList(ReservationIdentification1.mmReservationIdentification, ReservationCriteria1.mmSearchCriteria, ReservationCriteria2.mmSearchCriteria,
						CurrentOrDefaultReservation1Choice.mmCurrent, CurrentOrDefaultReservation1Choice.mmDefault, ReservationReport1.mmReservationIdentification, ReservationReport1.mmReservation, Reservations1.mmCurrentReservation,
						Reservations1.mmDefaultReservation, ReservationReport2.mmReservationIdentification, ReservationReport2.mmReservation, Reservations2.mmCurrentReservation, Reservations2.mmDefaultReservation,
						ReservationOrError3Choice.mmReservation, ReservationReport3.mmReservationIdentification, CurrentAndDefaultReservation1.mmCurrentReservation, CurrentAndDefaultReservation1.mmDefaultReservation,
						ReservationOrError2Choice.mmBusinessReport, ReservationOrError4Choice.mmBusinessReport, CurrentAndDefaultReservation2.mmCurrentReservation, CurrentAndDefaultReservation2.mmDefaultReservation,
						ReservationOrError5Choice.mmReservation, ReservationReport4.mmReservationIdentification);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(Reservation.mmReservationType, Reservation.mmRelatedIntraPositionTransfer, Reservation.mmSettlementInstruction, Reservation.mmAccountService);
				derivationComponent_lazy = () -> Arrays.asList(ReservationIdentificationDetails1.mmObject(), ReservationType1Choice.mmObject(), ReservationIdentification1.mmObject(), ReservationSearchCriteria1.mmObject(),
						ReservationCriteria1.mmObject(), ReservationSearchCriteria2.mmObject(), ReservationCriteria2.mmObject(), ReservationDetails2.mmObject(), CurrentOrDefaultReservation1Choice.mmObject(), Reservation2.mmObject(),
						ReservationDetails1.mmObject(), ReservationReport1.mmObject(), Reservations1.mmObject(), ReservationReport2.mmObject(), Reservations2.mmObject(), ReservationStatus1Choice.mmObject(), Reservation1.mmObject(),
						ReservationOrError3Choice.mmObject(), ReservationReport3.mmObject(), CurrentAndDefaultReservation1.mmObject(), ReservationOrError2Choice.mmObject(), ReservationOrError4Choice.mmObject(),
						CurrentAndDefaultReservation2.mmObject(), ReservationOrError5Choice.mmObject(), ReservationReport4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ReservationTypeCode getReservationType() {
		return reservationType;
	}

	public void setReservationType(ReservationTypeCode reservationType) {
		this.reservationType = reservationType;
	}

	public List<IntraPositionTransfer> getRelatedIntraPositionTransfer() {
		return relatedIntraPositionTransfer;
	}

	public void setRelatedIntraPositionTransfer(List<com.tools20022.repository.entity.IntraPositionTransfer> relatedIntraPositionTransfer) {
		this.relatedIntraPositionTransfer = relatedIntraPositionTransfer;
	}

	public List<CashSettlement> getSettlementInstruction() {
		return settlementInstruction;
	}

	public void setSettlementInstruction(List<com.tools20022.repository.entity.CashSettlement> settlementInstruction) {
		this.settlementInstruction = settlementInstruction;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(com.tools20022.repository.entity.AccountService accountService) {
		this.accountService = accountService;
	}
}