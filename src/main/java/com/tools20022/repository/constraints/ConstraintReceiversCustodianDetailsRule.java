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
 * If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails
 * must also be present in the same occurrence of ReceivingPartiesAndAccount1.
 */
public class ConstraintReceiversCustodianDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1
	 * ReceivingPartiesAndAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present in the same occurrence of ReceivingPartiesAndAccount1."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount1> forReceivingPartiesAndAccount1 = new MMConstraint<ReceivingPartiesAndAccount1>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present in the same occurrence of ReceivingPartiesAndAccount1.";
			owner_lazy = () -> ReceivingPartiesAndAccount1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation2
	 * ReceiveInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation2> forReceiveInformation2 = new MMConstraint<ReceiveInformation2>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4
	 * ReceivingPartiesAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount4> forReceivingPartiesAndAccount4 = new MMConstraint<ReceivingPartiesAndAccount4>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present.";
			owner_lazy = () -> ReceivingPartiesAndAccount4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation4
	 * ReceiveInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation4> forReceiveInformation4 = new MMConstraint<ReceiveInformation4>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8
	 * ReceivingPartiesAndAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount9
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount8> forReceivingPartiesAndAccount8 = new MMConstraint<ReceivingPartiesAndAccount8>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount9);
			owner_lazy = () -> ReceivingPartiesAndAccount8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8
	 * ReceiveInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation8> forReceiveInformation8 = new MMConstraint<ReceiveInformation8>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6
	 * ReceiveInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation6> forReceiveInformation6 = new MMConstraint<ReceiveInformation6>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11
	 * ReceiveInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation12
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation11> forReceiveInformation11 = new MMConstraint<ReceiveInformation11>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation12);
			owner_lazy = () -> ReceiveInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation1
	 * ReceiveInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation1> forReceiveInformation1 = new MMConstraint<ReceiveInformation1>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation3
	 * ReceiveInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation3> forReceiveInformation3 = new MMConstraint<ReceiveInformation3>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7
	 * ReceiveInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation7> forReceiveInformation7 = new MMConstraint<ReceiveInformation7>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5
	 * ReceiveInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation5> forReceiveInformation5 = new MMConstraint<ReceiveInformation5>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation5.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9
	 * ReceiveInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation13
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation9> forReceiveInformation9 = new MMConstraint<ReceiveInformation9>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation13);
			owner_lazy = () -> ReceiveInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13
	 * ReceiveInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation15
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation9
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation13> forReceiveInformation13 = new MMConstraint<ReceiveInformation13>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation9;
			owner_lazy = () -> ReceiveInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12
	 * ReceiveInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation14
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation11
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation12> forReceiveInformation12 = new MMConstraint<ReceiveInformation12>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation11;
			owner_lazy = () -> ReceiveInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9
	 * ReceivingPartiesAndAccount9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount13
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount8
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount8}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount9> forReceivingPartiesAndAccount9 = new MMConstraint<ReceivingPartiesAndAccount9>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediaryDetails is present, then ReceiversCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount8;
			owner_lazy = () -> ReceivingPartiesAndAccount9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15
	 * ReceiveInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation16
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation13
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation15> forReceiveInformation15 = new MMConstraint<ReceiveInformation15>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation13;
			owner_lazy = () -> ReceiveInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14
	 * ReceiveInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation17
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation12
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation14> forReceiveInformation14 = new MMConstraint<ReceiveInformation14>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation12;
			owner_lazy = () -> ReceiveInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17
	 * ReceiveInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation18
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation14
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation17> forReceiveInformation17 = new MMConstraint<ReceiveInformation17>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation14;
			owner_lazy = () -> ReceiveInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16
	 * ReceiveInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation19
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation19}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation15
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation15}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation16> forReceiveInformation16 = new MMConstraint<ReceiveInformation16>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation19);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation15;
			owner_lazy = () -> ReceiveInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14
	 * ReceivingPartiesAndAccount14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount18
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount18}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount13
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount14> forReceivingPartiesAndAccount14 = new MMConstraint<ReceivingPartiesAndAccount14>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount18);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13;
			owner_lazy = () -> ReceivingPartiesAndAccount14.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13
	 * ReceivingPartiesAndAccount13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount14
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount14}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount17
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount9
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount13> forReceivingPartiesAndAccount13 = new MMConstraint<ReceivingPartiesAndAccount13>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount14,
					com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount9;
			owner_lazy = () -> ReceivingPartiesAndAccount13.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation18
	 * ReceiveInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation17
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation17}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation18> forReceiveInformation18 = new MMConstraint<ReceiveInformation18>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation17;
			owner_lazy = () -> ReceiveInformation18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation19
	 * ReceiveInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceiveInformation16
	 * ConstraintReceiversCustodianDetailsRule.forReceiveInformation16}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation19> forReceiveInformation19 = new MMConstraint<ReceiveInformation19>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceiveInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceiveInformation16;
			owner_lazy = () -> ReceiveInformation19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17
	 * ReceivingPartiesAndAccount17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount13
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount17> forReceivingPartiesAndAccount17 = new MMConstraint<ReceivingPartiesAndAccount17>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount13;
			owner_lazy = () -> ReceivingPartiesAndAccount17.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount18
	 * ReceivingPartiesAndAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversCustodianDetails&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/ReceiversIntermediary1Details&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule#forReceivingPartiesAndAccount14
	 * ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount14}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceivingPartiesAndAccount18> forReceivingPartiesAndAccount18 = new MMConstraint<ReceivingPartiesAndAccount18>() {
		{
			validator = ConstraintReceiversCustodianDetailsRule::checkReceivingPartiesAndAccount18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetailsRule";
			definition = "If ReceiversIntermediary1Details is present, then ReceiversCustodianDetails must also be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversCustodianDetailsRule.forReceivingPartiesAndAccount14;
			owner_lazy = () -> ReceivingPartiesAndAccount18.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversCustodianDetails</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/ReceiversIntermediary1Details</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}
	};

	/**
	 * If ReceiversIntermediaryDetails is present, then
	 * ReceiversCustodianDetails must also be present in the same occurrence of
	 * ReceivingPartiesAndAccount1.
	 */
	public static void checkReceivingPartiesAndAccount1(ReceivingPartiesAndAccount1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation2(ReceiveInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediaryDetails is present, then
	 * ReceiversCustodianDetails must also be present.
	 */
	public static void checkReceivingPartiesAndAccount4(ReceivingPartiesAndAccount4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation4(ReceiveInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediaryDetails is present, then
	 * ReceiversCustodianDetails must also be present.
	 */
	public static void checkReceivingPartiesAndAccount8(ReceivingPartiesAndAccount8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation8(ReceiveInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation6(ReceiveInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation11(ReceiveInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation1(ReceiveInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation3(ReceiveInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation7(ReceiveInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation5(ReceiveInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation9(ReceiveInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation13(ReceiveInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation12(ReceiveInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediaryDetails is present, then
	 * ReceiversCustodianDetails must also be present.
	 */
	public static void checkReceivingPartiesAndAccount9(ReceivingPartiesAndAccount9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation15(ReceiveInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation14(ReceiveInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation17(ReceiveInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation16(ReceiveInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary1Details is present, then
	 * ReceiversCustodianDetails must also be present.
	 */
	public static void checkReceivingPartiesAndAccount14(ReceivingPartiesAndAccount14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary1Details is present, then
	 * ReceiversCustodianDetails must also be present.
	 */
	public static void checkReceivingPartiesAndAccount13(ReceivingPartiesAndAccount13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation18(ReceiveInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversCustodianDetails is not allowed.
	 */
	public static void checkReceiveInformation19(ReceiveInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary1Details is present, then
	 * ReceiversCustodianDetails must also be present.
	 */
	public static void checkReceivingPartiesAndAccount17(ReceivingPartiesAndAccount17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ReceiversIntermediary1Details is present, then
	 * ReceiversCustodianDetails must also be present.
	 */
	public static void checkReceivingPartiesAndAccount18(ReceivingPartiesAndAccount18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}