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
 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
 */
public class ConstraintReceiversIntermediaryDetailsRule {

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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation2> forReceiveInformation2 = new MMConstraint<ReceiveInformation2>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation2.mmObject();
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation4> forReceiveInformation4 = new MMConstraint<ReceiveInformation4>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			owner_lazy = () -> ReceiveInformation4.mmObject();
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation8> forReceiveInformation8 = new MMConstraint<ReceiveInformation8>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation6> forReceiveInformation6 = new MMConstraint<ReceiveInformation6>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation12
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation11> forReceiveInformation11 = new MMConstraint<ReceiveInformation11>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation12);
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation1> forReceiveInformation1 = new MMConstraint<ReceiveInformation1>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation3> forReceiveInformation3 = new MMConstraint<ReceiveInformation3>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation7> forReceiveInformation7 = new MMConstraint<ReceiveInformation7>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation5> forReceiveInformation5 = new MMConstraint<ReceiveInformation5>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation13
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation9> forReceiveInformation9 = new MMConstraint<ReceiveInformation9>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation13);
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation15
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation9
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation9}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation13> forReceiveInformation13 = new MMConstraint<ReceiveInformation13>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation9;
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation14
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation11
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation11}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation12> forReceiveInformation12 = new MMConstraint<ReceiveInformation12>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation11;
			owner_lazy = () -> ReceiveInformation12.mmObject();
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule#forReceiveInformation16
	 * ConstraintReceiversIntermediary1DetailsRule.forReceiveInformation16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation13
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation13}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation15> forReceiveInformation15 = new MMConstraint<ReceiveInformation15>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule.forReceiveInformation16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation13;
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation17
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation12
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation12}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation14> forReceiveInformation14 = new MMConstraint<ReceiveInformation14>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation12;
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
	 * name} = "ReceiversIntermediaryDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule#forReceiveInformation14
	 * ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation14}</li>
	 * </ul>
	 */
	public static final MMConstraint<ReceiveInformation17> forReceiveInformation17 = new MMConstraint<ReceiveInformation17>() {
		{
			validator = ConstraintReceiversIntermediaryDetailsRule::checkReceiveInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediaryDetailsRule";
			definition = "If PhysicalTransferDetails is present, then SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintReceiversIntermediaryDetailsRule.forReceiveInformation14;
			owner_lazy = () -> ReceiveInformation17.mmObject();
		}
	};

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation2(ReceiveInformation2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation4(ReceiveInformation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation8(ReceiveInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation6(ReceiveInformation6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation11(ReceiveInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation1(ReceiveInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation3(ReceiveInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation7(ReceiveInformation7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation5(ReceiveInformation5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation9(ReceiveInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation13(ReceiveInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation12(ReceiveInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation15(ReceiveInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation14(ReceiveInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PhysicalTransferDetails is present, then
	 * SettlementPartiesDetails/ReceiversIntermediaryDetails is not allowed.
	 */
	public static void checkReceiveInformation17(ReceiveInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}