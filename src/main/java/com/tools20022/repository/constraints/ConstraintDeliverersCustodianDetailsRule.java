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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If DeliverersIntermediaryDetails is present, then one occurrence of
 * DeliverersCustodianDetails must be present.
 */
public class ConstraintDeliverersCustodianDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount1
	 * DeliveringPartiesAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediaryDetails is present, then one occurrence of DeliverersCustodianDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount1> forDeliveringPartiesAndAccount1 = new MMConstraint<DeliveringPartiesAndAccount1>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediaryDetails is present, then one occurrence of DeliverersCustodianDetails must be present.";
			owner_lazy = () -> DeliveringPartiesAndAccount1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation2
	 * DeliverInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation2> forDeliverInformation2 = new MMConstraint<DeliverInformation2>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount4
	 * DeliveringPartiesAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount4> forDeliveringPartiesAndAccount4 = new MMConstraint<DeliveringPartiesAndAccount4>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present.";
			owner_lazy = () -> DeliveringPartiesAndAccount4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation4
	 * DeliverInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation4> forDeliverInformation4 = new MMConstraint<DeliverInformation4>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8
	 * DeliveringPartiesAndAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount9
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount9}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount8> forDeliveringPartiesAndAccount8 = new MMConstraint<DeliveringPartiesAndAccount8>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount9);
			owner_lazy = () -> DeliveringPartiesAndAccount8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7
	 * DeliverInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation7> forDeliverInformation7 = new MMConstraint<DeliverInformation7>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11
	 * DeliverInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation12
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation11> forDeliverInformation11 = new MMConstraint<DeliverInformation11>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation12);
			owner_lazy = () -> DeliverInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation1
	 * DeliverInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation1> forDeliverInformation1 = new MMConstraint<DeliverInformation1>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation3
	 * DeliverInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation3> forDeliverInformation3 = new MMConstraint<DeliverInformation3>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8
	 * DeliverInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation8> forDeliverInformation8 = new MMConstraint<DeliverInformation8>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5
	 * DeliverInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation5> forDeliverInformation5 = new MMConstraint<DeliverInformation5>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9
	 * DeliverInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation13
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation9> forDeliverInformation9 = new MMConstraint<DeliverInformation9>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation13);
			owner_lazy = () -> DeliverInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6
	 * DeliverInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation6> forDeliverInformation6 = new MMConstraint<DeliverInformation6>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			owner_lazy = () -> DeliverInformation6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12
	 * DeliverInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation14
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation11
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation12> forDeliverInformation12 = new MMConstraint<DeliverInformation12>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation11;
			owner_lazy = () -> DeliverInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13
	 * DeliverInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation15
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation9
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation13> forDeliverInformation13 = new MMConstraint<DeliverInformation13>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation9;
			owner_lazy = () -> DeliverInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount13
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount13
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount8
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount8}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount9> forDeliveringPartiesAndAccount9 = new MMConstraint<DeliveringPartiesAndAccount9>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediaryDetails is present, then DeliverersCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount8;
			owner_lazy = () -> DeliveringPartiesAndAccount9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15
	 * DeliverInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation16
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation13
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation15> forDeliverInformation15 = new MMConstraint<DeliverInformation15>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation13;
			owner_lazy = () -> DeliverInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14
	 * DeliverInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation17
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation12
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation12}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation14> forDeliverInformation14 = new MMConstraint<DeliverInformation14>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation12;
			owner_lazy = () -> DeliverInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16
	 * DeliverInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation19
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation15
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation15}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation16> forDeliverInformation16 = new MMConstraint<DeliverInformation16>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation15;
			owner_lazy = () -> DeliverInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17
	 * DeliverInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation18
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation14
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation17> forDeliverInformation17 = new MMConstraint<DeliverInformation17>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation14;
			owner_lazy = () -> DeliverInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14
	 * DeliveringPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount18
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount18
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount13
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount13
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount14> forDeliveringPartiesAndAccount14 = new MMConstraint<DeliveringPartiesAndAccount14>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount13;
			owner_lazy = () -> DeliveringPartiesAndAccount14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13
	 * DeliveringPartiesAndAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount14
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount14
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount17
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount17
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount9
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount9}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount13> forDeliveringPartiesAndAccount13 = new MMConstraint<DeliveringPartiesAndAccount13>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount14,
					com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount9;
			owner_lazy = () -> DeliveringPartiesAndAccount13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation19
	 * DeliverInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation16
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation16}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation19> forDeliverInformation19 = new MMConstraint<DeliverInformation19>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation16;
			owner_lazy = () -> DeliverInformation19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation18
	 * DeliverInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliverInformation17
	 * ConstraintDeliverersCustodianDetailsRule.forDeliverInformation17}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation18> forDeliverInformation18 = new MMConstraint<DeliverInformation18>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliverInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliverInformation17;
			owner_lazy = () -> DeliverInformation18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount18
	 * DeliveringPartiesAndAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount14
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount14
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount18> forDeliveringPartiesAndAccount18 = new MMConstraint<DeliveringPartiesAndAccount18>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount14;
			owner_lazy = () -> DeliveringPartiesAndAccount18.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/DeliverersIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount13
	 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount13
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliveringPartiesAndAccount17> forDeliveringPartiesAndAccount17 = new MMConstraint<DeliveringPartiesAndAccount17>() {
		{
			validator = ConstraintDeliverersCustodianDetailsRule::checkDeliveringPartiesAndAccount17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetailsRule";
			definition = "If DeliverersIntermediary1Details is present, then DeliverersCustodianDetails must also be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount13;
			owner_lazy = () -> DeliveringPartiesAndAccount17.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/DeliverersIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If DeliverersIntermediaryDetails is present, then one occurrence of
	 * DeliverersCustodianDetails must be present.
	 */
	public static void checkDeliveringPartiesAndAccount1(DeliveringPartiesAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation2(DeliverInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediaryDetails is present, then
	 * DeliverersCustodianDetails must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount4(DeliveringPartiesAndAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation4(DeliverInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediaryDetails is present, then
	 * DeliverersCustodianDetails must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount8(DeliveringPartiesAndAccount8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation7(DeliverInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation11(DeliverInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation1(DeliverInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation3(DeliverInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation8(DeliverInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation5(DeliverInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation9(DeliverInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation6(DeliverInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation12(DeliverInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation13(DeliverInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediaryDetails is present, then
	 * DeliverersCustodianDetails must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount9(DeliveringPartiesAndAccount9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation15(DeliverInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation14(DeliverInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation16(DeliverInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation17(DeliverInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediary1Details is present, then
	 * DeliverersCustodianDetails must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount14(DeliveringPartiesAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediary1Details is present, then
	 * DeliverersCustodianDetails must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount13(DeliveringPartiesAndAccount13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation19(DeliverInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersCustodianDetails is not allowed.
	 */
	public static void checkDeliverInformation18(DeliverInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediary1Details is present, then
	 * DeliverersCustodianDetails must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount18(DeliveringPartiesAndAccount18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DeliverersIntermediary1Details is present, then
	 * DeliverersCustodianDetails must also be present.
	 */
	public static void checkDeliveringPartiesAndAccount17(DeliveringPartiesAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}