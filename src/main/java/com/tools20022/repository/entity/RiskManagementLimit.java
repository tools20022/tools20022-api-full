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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CurrentLimitChoice;
import com.tools20022.repository.choice.LimitIdentification1Choice;
import com.tools20022.repository.choice.LimitStructure1Choice;
import com.tools20022.repository.choice.LimitType1Choice;
import com.tools20022.repository.entity.CashManagementService;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.entity.SystemMemberRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCashManagementService
 * RiskManagementLimit.mmCashManagementService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit#mmCounterparty
 * RiskManagementLimit.mmCounterparty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SystemMemberRole#mmLimit
 * SystemMemberRole.mmLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
 * CashManagementService.mmRiskManagementLimit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmCurrentLimitIdentification
 * LimitDetailsStructure1.mmCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmDefaultLimitIdentification
 * LimitDetailsStructure1.mmDefaultLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure1#mmNewLimitValueSet
 * LimitDetailsStructure1.mmNewLimitValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#mmCurrentLimitIdentification
 * LimitDetailsStructure3.mmCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure3#mmAllCurrentLimits
 * LimitDetailsStructure3.mmAllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitStructure1Choice#mmCurrentLimitIdentification
 * LimitStructure1Choice.mmCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitStructure1Choice#mmAllCurrentLimits
 * LimitStructure1Choice.mmAllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmCurrentLimitIdentification
 * LimitDetailsStructure2.mmCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmDefaultLimitIdentification
 * LimitDetailsStructure2.mmDefaultLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmAllCurrentLimits
 * LimitDetailsStructure2.mmAllCurrentLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmAllDefaultLimits
 * LimitDetailsStructure2.mmAllDefaultLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitDetailsStructure2#mmNewLimitValueSet
 * LimitDetailsStructure2.mmNewLimitValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#mmCurrent
 * LimitIdentification1Choice.mmCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#mmDefault
 * LimitIdentification1Choice.mmDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#mmAllCurrent
 * LimitIdentification1Choice.mmAllCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LimitIdentification1Choice#mmAllDefault
 * LimitIdentification1Choice.mmAllDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitStructure1#mmLimitIdentification
 * LimitStructure1.mmLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitStructure1#mmNewLimitValueSet
 * LimitStructure1.mmNewLimitValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport1#mmLimitIdentification
 * LimitReport1.mmLimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport1#mmLimit
 * LimitReport1.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits1#mmCurrentLimit
 * Limits1.mmCurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits1#mmDefaultLimit
 * Limits1.mmDefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport2#mmLimitIdentification
 * LimitReport2.mmLimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport2#mmLimit
 * LimitReport2.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits2#mmCurrentLimit
 * Limits2.mmCurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits2#mmDefaultLimit
 * Limits2.mmDefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport3#mmLimitIdentification
 * LimitReport3.mmLimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport3#mmLimit
 * LimitReport3.mmLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits3#mmCurrentLimit
 * Limits3.mmCurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits3#mmDefaultLimit
 * Limits3.mmDefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport4#mmLimitIdentification
 * LimitReport4.mmLimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits4#mmCurrentLimit
 * Limits4.mmCurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits4#mmDefaultLimit
 * Limits4.mmDefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CurrentLimitChoice#mmRiskManagementCurrentLimitIdentification
 * CurrentLimitChoice.mmRiskManagementCurrentLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport5#mmLimitIdentification
 * LimitReport5.mmLimitIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits5#mmCurrentLimit
 * Limits5.mmCurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits5#mmDefaultLimit
 * Limits5.mmDefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitStructure2#mmLimitIdentification
 * LimitStructure2.mmLimitIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitStructure2#mmNewLimitValueSet
 * LimitStructure2.mmNewLimitValueSet}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits6#mmCurrentLimit
 * Limits6.mmCurrentLimit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits6#mmDefaultLimit
 * Limits6.mmDefaultLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitReport6#mmLimitIdentification
 * LimitReport6.mmLimitIdentification}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.repository.msg.LimitStructure2
 * LimitStructure2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BilateralLimit2
 * BilateralLimit2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Limits6 Limits6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LimitReport6 LimitReport6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RiskManagementLimit"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class RiskManagementLimit extends Limit {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CashManagementService cashManagementService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService
	 * CashManagementService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashManagementService#mmRiskManagementLimit
	 * CashManagementService.mmRiskManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash management service which offers limit management services."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RiskManagementLimit, Optional<CashManagementService>> mmCashManagementService = new MMBusinessAssociationEnd<RiskManagementLimit, Optional<CashManagementService>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashManagementService";
			definition = "Cash management service which offers limit management services.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmRiskManagementLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashManagementService.mmObject();
		}

		@Override
		public Optional<CashManagementService> getValue(RiskManagementLimit obj) {
			return obj.getCashManagementService();
		}

		@Override
		public void setValue(RiskManagementLimit obj, Optional<CashManagementService> value) {
			obj.setCashManagementService(value.orElse(null));
		}
	};
	protected List<SystemMemberRole> counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmLimit
	 * SystemMemberRole.mmLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria1#mmBilateralLimitCounterpartyIdentification
	 * LimitSearchCriteria1.mmBilateralLimitCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LimitSearchCriteria2#mmBilateralLimitCounterpartyIdentification
	 * LimitSearchCriteria2.mmBilateralLimitCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RiskManagementLimit
	 * RiskManagementLimit}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the system member for which the limit is established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RiskManagementLimit, List<SystemMemberRole>> mmCounterparty = new MMBusinessAssociationEnd<RiskManagementLimit, List<SystemMemberRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(LimitSearchCriteria1.mmBilateralLimitCounterpartyIdentification, LimitSearchCriteria2.mmBilateralLimitCounterpartyIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RiskManagementLimit.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Identification of the system member for which the limit is established.";
			minOccurs = 1;
			opposite_lazy = () -> SystemMemberRole.mmLimit;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemMemberRole.mmObject();
		}

		@Override
		public List<SystemMemberRole> getValue(RiskManagementLimit obj) {
			return obj.getCounterparty();
		}

		@Override
		public void setValue(RiskManagementLimit obj, List<SystemMemberRole> value) {
			obj.setCounterparty(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RiskManagementLimit";
				definition = "Cash management feature limiting the maximum risk that a party accepts to take with respect to a counterparty or a set of counterparties. A risk management limit is either bilateral, for a counterparty, or multilateral, for a set of counterparties or all other members in a system.The limit may also apply to sponsored or indirect members. In principle, a risk management limit is calculated on the net position between two members and is expressed as a credit or debit limit, from the point of view of the party setting the limit.";
				associationDomain_lazy = () -> Arrays.asList(SystemMemberRole.mmLimit, com.tools20022.repository.entity.CashManagementService.mmRiskManagementLimit);
				derivationElement_lazy = () -> Arrays.asList(LimitDetailsStructure1.mmCurrentLimitIdentification, LimitDetailsStructure1.mmDefaultLimitIdentification, LimitDetailsStructure1.mmNewLimitValueSet,
						LimitDetailsStructure3.mmCurrentLimitIdentification, LimitDetailsStructure3.mmAllCurrentLimits, LimitStructure1Choice.mmCurrentLimitIdentification, LimitStructure1Choice.mmAllCurrentLimits,
						LimitDetailsStructure2.mmCurrentLimitIdentification, LimitDetailsStructure2.mmDefaultLimitIdentification, LimitDetailsStructure2.mmAllCurrentLimits, LimitDetailsStructure2.mmAllDefaultLimits,
						LimitDetailsStructure2.mmNewLimitValueSet, LimitIdentification1Choice.mmCurrent, LimitIdentification1Choice.mmDefault, LimitIdentification1Choice.mmAllCurrent, LimitIdentification1Choice.mmAllDefault,
						LimitStructure1.mmLimitIdentification, LimitStructure1.mmNewLimitValueSet, LimitReport1.mmLimitIdentification, LimitReport1.mmLimit, Limits1.mmCurrentLimit, Limits1.mmDefaultLimit,
						LimitReport2.mmLimitIdentification, LimitReport2.mmLimit, Limits2.mmCurrentLimit, Limits2.mmDefaultLimit, LimitReport3.mmLimitIdentification, LimitReport3.mmLimit, Limits3.mmCurrentLimit, Limits3.mmDefaultLimit,
						LimitReport4.mmLimitIdentification, Limits4.mmCurrentLimit, Limits4.mmDefaultLimit, CurrentLimitChoice.mmRiskManagementCurrentLimitIdentification, LimitReport5.mmLimitIdentification, Limits5.mmCurrentLimit,
						Limits5.mmDefaultLimit, LimitStructure2.mmLimitIdentification, LimitStructure2.mmNewLimitValueSet, Limits6.mmCurrentLimit, Limits6.mmDefaultLimit, LimitReport6.mmLimitIdentification);
				superType_lazy = () -> Limit.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RiskManagementLimit.mmCashManagementService, com.tools20022.repository.entity.RiskManagementLimit.mmCounterparty);
				derivationComponent_lazy = () -> Arrays.asList(RiskManagementLimitIdentificationDetails.mmObject(), LimitIdentificationDetails1.mmObject(), LimitIdentificationDetails2.mmObject(), LimitDetailsStructure1.mmObject(),
						LimitIdentificationDetails3.mmObject(), LimitDetailsStructure3.mmObject(), LimitType1Choice.mmObject(), LimitIdentification1.mmObject(), LimitIdentification2.mmObject(), LimitStructure1Choice.mmObject(),
						LimitDetailsStructure2.mmObject(), LimitIdentification1Choice.mmObject(), LimitStructure1.mmObject(), BilateralLimitDetails1.mmObject(), BilateralLimitDetails2.mmObject(), BilateralLimitDetails3.mmObject(),
						BilateralLimit1.mmObject(), LimitReport1.mmObject(), Limits1.mmObject(), LimitReport2.mmObject(), Limits2.mmObject(), LimitReport3.mmObject(), Limits3.mmObject(), LimitReport4.mmObject(), Limits4.mmObject(),
						LimitIdentification4.mmObject(), LimitUtilisationJournalSearchCriteria1.mmObject(), LimitReport5.mmObject(), Limits5.mmObject(), LimitStructure2.mmObject(), BilateralLimit2.mmObject(), Limits6.mmObject(),
						LimitReport6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return RiskManagementLimit.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CashManagementService> getCashManagementService() {
		return cashManagementService == null ? Optional.empty() : Optional.of(cashManagementService);
	}

	public RiskManagementLimit setCashManagementService(com.tools20022.repository.entity.CashManagementService cashManagementService) {
		this.cashManagementService = cashManagementService;
		return this;
	}

	public List<SystemMemberRole> getCounterparty() {
		return counterparty == null ? counterparty = new ArrayList<>() : counterparty;
	}

	public RiskManagementLimit setCounterparty(List<SystemMemberRole> counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}
}