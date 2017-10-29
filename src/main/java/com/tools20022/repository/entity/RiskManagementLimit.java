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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.LimitIdentification1Choice;
import com.tools20022.repository.choice.LimitStructure1Choice;
import com.tools20022.repository.choice.LimitType1Choice;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash management feature limiting the maximum risk that a party accepts to
 * take with respect to a counterparty or a set of counterparties. A risk
 * management limit is either bilateral, for a counterparty, or multilateral,
 * for a set of counterparties or all other members in a system.The limit may
 * also apply to sponsored or indirect members. In principle, a risk management
 * limit is calculated on the net position between two members and is expressed
 * as a credit or debit limit, from the point of view of the party setting the
 * limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RiskManagementLimit" src="doc-files/RiskManagementLimit.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#CashManagementService
 * RiskManagementLimit.CashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#Counterparty
 * RiskManagementLimit.Counterparty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#Limit
 * SystemMemberRole.Limit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#RiskManagementLimit
 * CashManagementService.RiskManagementLimit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#CurrentLimitIdentification
 * LimitDetailsStructure1.CurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#DefaultLimitIdentification
 * LimitDetailsStructure1.DefaultLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#NewLimitValueSet
 * LimitDetailsStructure1.NewLimitValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#CurrentLimitIdentification
 * LimitDetailsStructure3.CurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#AllCurrentLimits
 * LimitDetailsStructure3.AllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitStructure1Choice#CurrentLimitIdentification
 * LimitStructure1Choice.CurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitStructure1Choice#AllCurrentLimits
 * LimitStructure1Choice.AllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#CurrentLimitIdentification
 * LimitDetailsStructure2.CurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#DefaultLimitIdentification
 * LimitDetailsStructure2.DefaultLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#AllCurrentLimits
 * LimitDetailsStructure2.AllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#AllDefaultLimits
 * LimitDetailsStructure2.AllDefaultLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#NewLimitValueSet
 * LimitDetailsStructure2.NewLimitValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#Current
 * LimitIdentification1Choice.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#Default
 * LimitIdentification1Choice.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#AllCurrent
 * LimitIdentification1Choice.AllCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#AllDefault
 * LimitIdentification1Choice.AllDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitStructure1#LimitIdentification
 * LimitStructure1.LimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitStructure1#NewLimitValueSet
 * LimitStructure1.NewLimitValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport1#LimitIdentification
 * LimitReport1.LimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport1#Limit
 * LimitReport1.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits1#CurrentLimit
 * Limits1.CurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits1#DefaultLimit
 * Limits1.DefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport2#LimitIdentification
 * LimitReport2.LimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport2#Limit
 * LimitReport2.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits2#CurrentLimit
 * Limits2.CurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits2#DefaultLimit
 * Limits2.DefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport3#LimitIdentification
 * LimitReport3.LimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport3#Limit
 * LimitReport3.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits3#CurrentLimit
 * Limits3.CurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits3#DefaultLimit
 * Limits3.DefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport4#LimitIdentification
 * LimitReport4.LimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits4#CurrentLimit
 * Limits4.CurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits4#DefaultLimit
 * Limits4.DefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentLimitChoice#RiskManagementCurrentLimitIdentification
 * CurrentLimitChoice.RiskManagementCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport5#LimitIdentification
 * LimitReport5.LimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits5#CurrentLimit
 * Limits5.CurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits5#DefaultLimit
 * Limits5.DefaultLimit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RiskManagementLimitIdentificationDetails
 * RiskManagementLimitIdentificationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentificationDetails1
 * LimitIdentificationDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentificationDetails2
 * LimitIdentificationDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitDetailsStructure1
 * LimitDetailsStructure1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentificationDetails3
 * LimitIdentificationDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitDetailsStructure3
 * LimitDetailsStructure3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LimitType1Choice
 * LimitType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentification1
 * LimitIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentification2
 * LimitIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LimitStructure1Choice
 * LimitStructure1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitDetailsStructure2
 * LimitDetailsStructure2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.LimitIdentification1Choice
 * LimitIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitStructure1
 * LimitStructure1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BilateralLimitDetails1
 * BilateralLimitDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BilateralLimitDetails2
 * BilateralLimitDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BilateralLimitDetails3
 * BilateralLimitDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BilateralLimit1
 * BilateralLimit1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport1 LimitReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits1 Limits1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport2 LimitReport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits2 Limits2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport3 LimitReport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits3 Limits3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport4 LimitReport4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits4 Limits4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitIdentification4
 * LimitIdentification4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1
 * LimitUtilisationJournalSearchCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport5 LimitReport5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits5 Limits5}</li>
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
 * "RiskManagementLimit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
 * </li>
 * </ul>
 */
public class RiskManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash management service which offers limit management services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#RiskManagementLimit
	 * CashManagementService.RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management service which offers limit management services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashManagementService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Cash management service which offers limit management services.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.RiskManagementLimit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the system member for which the limit is established.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#Limit
	 * SystemMemberRole.Limit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#BilateralLimitCounterpartyIdentification
	 * LimitSearchCriteria1.BilateralLimitCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#BilateralLimitCounterpartyIdentification
	 * LimitSearchCriteria2.BilateralLimitCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the system member for which the limit is established."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Counterparty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitSearchCriteria1.BilateralLimitCounterpartyIdentification, com.tools20022.repository.msg.LimitSearchCriteria2.BilateralLimitCounterpartyIdentification);
			elementContext_lazy = () -> RiskManagementLimit.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Identification of the system member for which the limit is established.";
			minOccurs = 1;
			type_lazy = () -> SystemMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.Limit;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RiskManagementLimit";
				definition = "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemMemberRole.Limit, com.tools20022.repository.entity.CashManagementService.RiskManagementLimit);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitDetailsStructure1.CurrentLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure1.DefaultLimitIdentification,
						com.tools20022.repository.msg.LimitDetailsStructure1.NewLimitValueSet, com.tools20022.repository.msg.LimitDetailsStructure3.CurrentLimitIdentification,
						com.tools20022.repository.msg.LimitDetailsStructure3.AllCurrentLimits, com.tools20022.repository.choice.LimitStructure1Choice.CurrentLimitIdentification,
						com.tools20022.repository.choice.LimitStructure1Choice.AllCurrentLimits, com.tools20022.repository.msg.LimitDetailsStructure2.CurrentLimitIdentification,
						com.tools20022.repository.msg.LimitDetailsStructure2.DefaultLimitIdentification, com.tools20022.repository.msg.LimitDetailsStructure2.AllCurrentLimits,
						com.tools20022.repository.msg.LimitDetailsStructure2.AllDefaultLimits, com.tools20022.repository.msg.LimitDetailsStructure2.NewLimitValueSet, com.tools20022.repository.choice.LimitIdentification1Choice.Current,
						com.tools20022.repository.choice.LimitIdentification1Choice.Default, com.tools20022.repository.choice.LimitIdentification1Choice.AllCurrent, com.tools20022.repository.choice.LimitIdentification1Choice.AllDefault,
						com.tools20022.repository.msg.LimitStructure1.LimitIdentification, com.tools20022.repository.msg.LimitStructure1.NewLimitValueSet, com.tools20022.repository.msg.LimitReport1.LimitIdentification,
						com.tools20022.repository.msg.LimitReport1.Limit, com.tools20022.repository.msg.Limits1.CurrentLimit, com.tools20022.repository.msg.Limits1.DefaultLimit,
						com.tools20022.repository.msg.LimitReport2.LimitIdentification, com.tools20022.repository.msg.LimitReport2.Limit, com.tools20022.repository.msg.Limits2.CurrentLimit,
						com.tools20022.repository.msg.Limits2.DefaultLimit, com.tools20022.repository.msg.LimitReport3.LimitIdentification, com.tools20022.repository.msg.LimitReport3.Limit,
						com.tools20022.repository.msg.Limits3.CurrentLimit, com.tools20022.repository.msg.Limits3.DefaultLimit, com.tools20022.repository.msg.LimitReport4.LimitIdentification,
						com.tools20022.repository.msg.Limits4.CurrentLimit, com.tools20022.repository.msg.Limits4.DefaultLimit, com.tools20022.repository.choice.CurrentLimitChoice.RiskManagementCurrentLimitIdentification,
						com.tools20022.repository.msg.LimitReport5.LimitIdentification, com.tools20022.repository.msg.Limits5.CurrentLimit, com.tools20022.repository.msg.Limits5.DefaultLimit);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.CashManagementService, com.tools20022.repository.entity.RiskManagementLimit.Counterparty);
				derivationComponent_lazy = () -> Arrays.asList(RiskManagementLimitIdentificationDetails.mmObject(), LimitIdentificationDetails1.mmObject(), LimitIdentificationDetails2.mmObject(), LimitDetailsStructure1.mmObject(),
						LimitIdentificationDetails3.mmObject(), LimitDetailsStructure3.mmObject(), LimitType1Choice.mmObject(), LimitIdentification1.mmObject(), LimitIdentification2.mmObject(), LimitStructure1Choice.mmObject(),
						LimitDetailsStructure2.mmObject(), LimitIdentification1Choice.mmObject(), LimitStructure1.mmObject(), BilateralLimitDetails1.mmObject(), BilateralLimitDetails2.mmObject(), BilateralLimitDetails3.mmObject(),
						BilateralLimit1.mmObject(), LimitReport1.mmObject(), Limits1.mmObject(), LimitReport2.mmObject(), Limits2.mmObject(), LimitReport3.mmObject(), Limits3.mmObject(), LimitReport4.mmObject(), Limits4.mmObject(),
						LimitIdentification4.mmObject(), LimitUtilisationJournalSearchCriteria1.mmObject(), LimitReport5.mmObject(), Limits5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}