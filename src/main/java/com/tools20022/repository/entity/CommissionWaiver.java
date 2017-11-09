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
import com.tools20022.repository.choice.WaivingInstruction1Choice;
import com.tools20022.repository.choice.WaivingInstruction2Choice;
import com.tools20022.repository.codeset.WaivingInstructionCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommissionWaiver2;
import com.tools20022.repository.msg.CommissionWaiver3;
import com.tools20022.repository.msg.CommissionWaiver4;
import com.tools20022.repository.msg.WaivingType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Non-enforcement of the right to all or part of a commission by the party
 * entitled to the commission.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CommissionWaiver" src="doc-files/CommissionWaiver.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.WaivingType1 WaivingType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver2
 * CommissionWaiver2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver3
 * CommissionWaiver3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.WaivingInstruction1Choice
 * WaivingInstruction1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommissionWaiver4
 * CommissionWaiver4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.WaivingInstruction2Choice
 * WaivingInstruction2Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionWaiving
 * Commission.mmCommissionWaiving}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmCommission
 * CommissionWaiver.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmInstructionBasis
 * CommissionWaiver.mmInstructionBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmWaivedRate
 * CommissionWaiver.mmWaivedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommissionWaiver#mmNonWaivedRate
 * CommissionWaiver.mmNonWaivedRate}</li>
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
 * "CommissionWaiver"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Non-enforcement of the right to all or part of a commission by the party entitled to the commission."
 * </li>
 * </ul>
 */
public class CommissionWaiver {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Commission commission;
	/**
	 * Commission to which the waiver applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionWaiving
	 * Commission.mmCommissionWaiving}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission to which the waiver applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCommission = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission to which the waiver applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmCommissionWaiving;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};
	protected WaivingInstructionCode instructionBasis;
	/**
	 * Form of the rebate, eg, cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WaivingInstructionCode
	 * WaivingInstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.WaivingType1#mmStructured
	 * WaivingType1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver2#mmInstructionBasis
	 * CommissionWaiver2.mmInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmInstructionBasis
	 * CommissionWaiver3.mmInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmExtendedInstructionBasis
	 * CommissionWaiver3.mmExtendedInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction1Choice#mmCode
	 * WaivingInstruction1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction1Choice#mmProprietary
	 * WaivingInstruction1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver4#mmInstructionBasis
	 * CommissionWaiver4.mmInstructionBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction2Choice#mmCode
	 * WaivingInstruction2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction2Choice#mmProprietary
	 * WaivingInstruction2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of the rebate, eg, cash."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInstructionBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(WaivingType1.mmStructured, CommissionWaiver2.mmInstructionBasis, CommissionWaiver3.mmInstructionBasis, CommissionWaiver3.mmExtendedInstructionBasis, WaivingInstruction1Choice.mmCode,
					WaivingInstruction1Choice.mmProprietary, CommissionWaiver4.mmInstructionBasis, WaivingInstruction2Choice.mmCode, WaivingInstruction2Choice.mmProprietary);
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructionBasis";
			definition = "Form of the rebate, eg, cash.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WaivingInstructionCode.mmObject();
		}
	};
	protected PercentageRate waivedRate;
	/**
	 * Proportion of the commission that is waived, ie, if the commission is 5%
	 * and half is waived, 2.5% should be stated in this field.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver2#mmWaivedRate
	 * CommissionWaiver2.mmWaivedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver3#mmWaivedRate
	 * CommissionWaiver3.mmWaivedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommissionWaiver4#mmWaivedRate
	 * CommissionWaiver4.mmWaivedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaivedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proportion of the commission that is waived, ie, if  the commission is 5% and half is waived, 2.5% should be stated in this field."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWaivedRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CommissionWaiver2.mmWaivedRate, CommissionWaiver3.mmWaivedRate, CommissionWaiver4.mmWaivedRate);
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaivedRate";
			definition = "Proportion of the commission that is waived, ie, if  the commission is 5% and half is waived, 2.5% should be stated in this field.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate nonWaivedRate;
	/**
	 * New commission rate applied, after waiving.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CommissionWaiver
	 * CommissionWaiver}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonWaivedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New commission rate applied, after waiving."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNonWaivedRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> CommissionWaiver.mmObject();
			isDerived = true;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonWaivedRate";
			definition = "New commission rate applied, after waiving.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CommissionWaiver";
				definition = "Non-enforcement of the right to all or part of a commission by the party entitled to the commission.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.mmCommissionWaiving);
				element_lazy = () -> Arrays.asList(CommissionWaiver.mmCommission, CommissionWaiver.mmInstructionBasis, CommissionWaiver.mmWaivedRate, CommissionWaiver.mmNonWaivedRate);
				derivationComponent_lazy = () -> Arrays.asList(WaivingType1.mmObject(), CommissionWaiver2.mmObject(), CommissionWaiver3.mmObject(), WaivingInstruction1Choice.mmObject(), CommissionWaiver4.mmObject(),
						WaivingInstruction2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(com.tools20022.repository.entity.Commission commission) {
		this.commission = commission;
	}

	public WaivingInstructionCode getInstructionBasis() {
		return instructionBasis;
	}

	public void setInstructionBasis(WaivingInstructionCode instructionBasis) {
		this.instructionBasis = instructionBasis;
	}

	public PercentageRate getWaivedRate() {
		return waivedRate;
	}

	public void setWaivedRate(PercentageRate waivedRate) {
		this.waivedRate = waivedRate;
	}

	public PercentageRate getNonWaivedRate() {
		return nonWaivedRate;
	}

	public void setNonWaivedRate(PercentageRate nonWaivedRate) {
		this.nonWaivedRate = nonWaivedRate;
	}
}