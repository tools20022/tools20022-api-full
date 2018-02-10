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
 * If PhysicalTransferDetails is present, then
 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
 */
public class ConstraintDeliverersIntermediaryDetailsRule {

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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation2> forDeliverInformation2 = new MMConstraint<DeliverInformation2>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			owner_lazy = () -> DeliverInformation2.mmObject();
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation4> forDeliverInformation4 = new MMConstraint<DeliverInformation4>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			owner_lazy = () -> DeliverInformation4.mmObject();
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation7> forDeliverInformation7 = new MMConstraint<DeliverInformation7>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation12
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation11> forDeliverInformation11 = new MMConstraint<DeliverInformation11>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation12);
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation1> forDeliverInformation1 = new MMConstraint<DeliverInformation1>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation3> forDeliverInformation3 = new MMConstraint<DeliverInformation3>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation8> forDeliverInformation8 = new MMConstraint<DeliverInformation8>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation5> forDeliverInformation5 = new MMConstraint<DeliverInformation5>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation13
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation9> forDeliverInformation9 = new MMConstraint<DeliverInformation9>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation13);
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation6> forDeliverInformation6 = new MMConstraint<DeliverInformation6>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation14
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation11
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation12> forDeliverInformation12 = new MMConstraint<DeliverInformation12>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation11;
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation15
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation9
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation13> forDeliverInformation13 = new MMConstraint<DeliverInformation13>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation9;
			owner_lazy = () -> DeliverInformation13.mmObject();
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation16
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation13
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation15> forDeliverInformation15 = new MMConstraint<DeliverInformation15>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation13;
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation17
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation12
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation12}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation14> forDeliverInformation14 = new MMConstraint<DeliverInformation14>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation12;
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation19
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation15
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation15}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation16> forDeliverInformation16 = new MMConstraint<DeliverInformation16>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation15;
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation18
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation14
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation17> forDeliverInformation17 = new MMConstraint<DeliverInformation17>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation14;
			owner_lazy = () -> DeliverInformation17.mmObject();
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation16
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation16}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation19> forDeliverInformation19 = new MMConstraint<DeliverInformation19>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation16;
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
	 * name} = "DeliverersIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule#forDeliverInformation17
	 * ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation17}</li>
	 * </ul>
	 */
	public static final MMConstraint<DeliverInformation18> forDeliverInformation18 = new MMConstraint<DeliverInformation18>() {
		{
			validator = ConstraintDeliverersIntermediaryDetailsRule::checkDeliverInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintDeliverersIntermediaryDetailsRule.forDeliverInformation17;
			owner_lazy = () -> DeliverInformation18.mmObject();
		}
	};

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation2(DeliverInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation4(DeliverInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation7(DeliverInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation11(DeliverInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation1(DeliverInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation3(DeliverInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation8(DeliverInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation5(DeliverInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation9(DeliverInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation6(DeliverInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation12(DeliverInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation13(DeliverInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation15(DeliverInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation14(DeliverInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation16(DeliverInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation17(DeliverInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation19(DeliverInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/DeliverersIntermediaryDetails is not allowed.
	 */
	public static void checkDeliverInformation18(DeliverInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}