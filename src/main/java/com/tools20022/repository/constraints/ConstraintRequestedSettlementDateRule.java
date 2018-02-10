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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * Either TransferDetails/RequestedSettlementDate may be present in one or more
 * occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate
 * may be present, but not both.
 */
public class ConstraintRequestedSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08
	 * TransferInConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV07
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV08> forTransferInConfirmationV08 = new MMConstraint<TransferInConfirmationV08>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV07;
			owner_lazy = () -> TransferInConfirmationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08
	 * TransferInInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV07
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV08> forTransferInInstructionV08 = new MMConstraint<TransferInInstructionV08>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV07;
			owner_lazy = () -> TransferInInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08
	 * TransferOutConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV07
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV08> forTransferOutConfirmationV08 = new MMConstraint<TransferOutConfirmationV08>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV07;
			owner_lazy = () -> TransferOutConfirmationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08
	 * TransferOutInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV07
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV08> forTransferOutInstructionV08 = new MMConstraint<TransferOutInstructionV08>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV07;
			owner_lazy = () -> TransferOutInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07
	 * TransferInConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV08
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV06
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV07> forTransferInConfirmationV07 = new MMConstraint<TransferInConfirmationV07>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV06;
			owner_lazy = () -> TransferInConfirmationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07
	 * TransferOutConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV08
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV06
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV07> forTransferOutConfirmationV07 = new MMConstraint<TransferOutConfirmationV07>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV06;
			owner_lazy = () -> TransferOutConfirmationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07
	 * TransferOutInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV08
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV06
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV07> forTransferOutInstructionV07 = new MMConstraint<TransferOutInstructionV07>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV06;
			owner_lazy = () -> TransferOutInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07
	 * TransferInInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV08
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV06
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV07> forTransferInInstructionV07 = new MMConstraint<TransferInInstructionV07>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV06;
			owner_lazy = () -> TransferInInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV04
	 * TransferInConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV05
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV04> forTransferInConfirmationV04 = new MMConstraint<TransferInConfirmationV04>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV05);
			owner_lazy = () -> TransferInConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV04
	 * TransferInInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV05
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV04> forTransferInInstructionV04 = new MMConstraint<TransferInInstructionV04>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV05);
			owner_lazy = () -> TransferInInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV04
	 * TransferOutConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV05
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV04> forTransferOutConfirmationV04 = new MMConstraint<TransferOutConfirmationV04>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV05);
			owner_lazy = () -> TransferOutConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV04
	 * TransferOutInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV05
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV04> forTransferOutInstructionV04 = new MMConstraint<TransferOutInstructionV04>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV05);
			owner_lazy = () -> TransferOutInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV05
	 * TransferInConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV06
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV04
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV05> forTransferInConfirmationV05 = new MMConstraint<TransferInConfirmationV05>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV04;
			owner_lazy = () -> TransferInConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05
	 * TransferOutInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV06
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV04
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV05> forTransferOutInstructionV05 = new MMConstraint<TransferOutInstructionV05>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV04;
			owner_lazy = () -> TransferOutInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV05
	 * TransferInInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV06
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV04
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV05> forTransferInInstructionV05 = new MMConstraint<TransferInInstructionV05>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV04;
			owner_lazy = () -> TransferInInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV05
	 * TransferOutConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV06
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV04
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV05> forTransferOutConfirmationV05 = new MMConstraint<TransferOutConfirmationV05>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV04;
			owner_lazy = () -> TransferOutConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV06
	 * TransferInInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV07
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInInstructionV05
	 * ConstraintRequestedSettlementDateRule.forTransferInInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV06> forTransferInInstructionV06 = new MMConstraint<TransferInInstructionV06>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInInstructionV05;
			owner_lazy = () -> TransferInInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV06
	 * TransferOutConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV07
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutConfirmationV05
	 * ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV06> forTransferOutConfirmationV06 = new MMConstraint<TransferOutConfirmationV06>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutConfirmationV05;
			owner_lazy = () -> TransferOutConfirmationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV06
	 * TransferOutInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV07
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOutInstructionV05
	 * ConstraintRequestedSettlementDateRule.forTransferOutInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV06> forTransferOutInstructionV06 = new MMConstraint<TransferOutInstructionV06>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOutInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOutInstructionV05;
			owner_lazy = () -> TransferOutInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV06
	 * TransferInConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV07
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferInConfirmationV05
	 * ConstraintRequestedSettlementDateRule.forTransferInConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV06> forTransferInConfirmationV06 = new MMConstraint<TransferInConfirmationV06>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferInConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferInConfirmationV05;
			owner_lazy = () -> TransferInConfirmationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut10 TransferOut10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut12
	 * ConstraintRequestedSettlementDateRule.forTransferOut12}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut10> forTransferOut10 = new MMConstraint<TransferOut10>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut12);
			owner_lazy = () -> TransferOut10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn8 TransferIn8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn9
	 * ConstraintRequestedSettlementDateRule.forTransferIn9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn8> forTransferIn8 = new MMConstraint<TransferIn8>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn9);
			owner_lazy = () -> TransferIn8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut9 TransferOut9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or \r\nSettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut11
	 * ConstraintRequestedSettlementDateRule.forTransferOut11}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut9> forTransferOut9 = new MMConstraint<TransferOut9>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or \r\nSettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut11);
			owner_lazy = () -> TransferOut9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn7 TransferIn7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn10
	 * ConstraintRequestedSettlementDateRule.forTransferIn10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn7> forTransferIn7 = new MMConstraint<TransferIn7>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn10);
			owner_lazy = () -> TransferIn7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn10 TransferIn10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn13
	 * ConstraintRequestedSettlementDateRule.forTransferIn13}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn7
	 * ConstraintRequestedSettlementDateRule.forTransferIn7}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn10> forTransferIn10 = new MMConstraint<TransferIn10>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn7;
			owner_lazy = () -> TransferIn10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn9 TransferIn9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn12
	 * ConstraintRequestedSettlementDateRule.forTransferIn12}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn8
	 * ConstraintRequestedSettlementDateRule.forTransferIn8}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn9> forTransferIn9 = new MMConstraint<TransferIn9>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn12);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn8;
			owner_lazy = () -> TransferIn9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut11 TransferOut11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut15
	 * ConstraintRequestedSettlementDateRule.forTransferOut15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut9
	 * ConstraintRequestedSettlementDateRule.forTransferOut9}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut11> forTransferOut11 = new MMConstraint<TransferOut11>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut9;
			owner_lazy = () -> TransferOut11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut12 TransferOut12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut14
	 * ConstraintRequestedSettlementDateRule.forTransferOut14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut10
	 * ConstraintRequestedSettlementDateRule.forTransferOut10}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut12> forTransferOut12 = new MMConstraint<TransferOut12>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut10;
			owner_lazy = () -> TransferOut12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn13 TransferIn13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn15
	 * ConstraintRequestedSettlementDateRule.forTransferIn15}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn10
	 * ConstraintRequestedSettlementDateRule.forTransferIn10}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn13> forTransferIn13 = new MMConstraint<TransferIn13>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn10;
			owner_lazy = () -> TransferIn13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut14 TransferOut14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut16
	 * ConstraintRequestedSettlementDateRule.forTransferOut16}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut12
	 * ConstraintRequestedSettlementDateRule.forTransferOut12}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut14> forTransferOut14 = new MMConstraint<TransferOut14>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut12;
			owner_lazy = () -> TransferOut14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn12 TransferIn12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn14
	 * ConstraintRequestedSettlementDateRule.forTransferIn14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn9
	 * ConstraintRequestedSettlementDateRule.forTransferIn9}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn12> forTransferIn12 = new MMConstraint<TransferIn12>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn9;
			owner_lazy = () -> TransferIn12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut15 TransferOut15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut17
	 * ConstraintRequestedSettlementDateRule.forTransferOut17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut11
	 * ConstraintRequestedSettlementDateRule.forTransferOut11}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut15> forTransferOut15 = new MMConstraint<TransferOut15>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut11;
			owner_lazy = () -> TransferOut15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut17 TransferOut17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut15
	 * ConstraintRequestedSettlementDateRule.forTransferOut15}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut17> forTransferOut17 = new MMConstraint<TransferOut17>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut15;
			owner_lazy = () -> TransferOut17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn14 TransferIn14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn12
	 * ConstraintRequestedSettlementDateRule.forTransferIn12}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn14> forTransferIn14 = new MMConstraint<TransferIn14>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn12;
			owner_lazy = () -> TransferIn14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn15 TransferIn15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn13
	 * ConstraintRequestedSettlementDateRule.forTransferIn13}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn15> forTransferIn15 = new MMConstraint<TransferIn15>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferIn15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn13;
			owner_lazy = () -> TransferIn15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut16 TransferOut16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut14
	 * ConstraintRequestedSettlementDateRule.forTransferOut14}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut16> forTransferOut16 = new MMConstraint<TransferOut16>() {
		{
			validator = ConstraintRequestedSettlementDateRule::checkTransferOut16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut14;
			owner_lazy = () -> TransferOut16.mmObject();
		}
	};

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInConfirmationV08(TransferInConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInInstructionV08(TransferInInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutConfirmationV08(TransferOutConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutInstructionV08(TransferOutInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInConfirmationV07(TransferInConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutConfirmationV07(TransferOutConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutInstructionV07(TransferOutInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInInstructionV07(TransferInInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInConfirmationV04(TransferInConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInInstructionV04(TransferInInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutConfirmationV04(TransferOutConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutInstructionV04(TransferOutInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInConfirmationV05(TransferInConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutInstructionV05(TransferOutInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInInstructionV05(TransferInInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutConfirmationV05(TransferOutConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInInstructionV06(TransferInInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutConfirmationV06(TransferOutConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOutInstructionV06(TransferOutInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferInConfirmationV06(TransferInConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut10(TransferOut10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn8(TransferIn8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or <br>
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut9(TransferOut9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn7(TransferIn7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn10(TransferIn10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn9(TransferIn9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut11(TransferOut11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut12(TransferOut12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate may
	 * be present in one or more occurrences of
	 * TransferAndReferences/TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn13(TransferIn13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut14(TransferOut14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn12(TransferIn12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate may
	 * be present in one or more occurrences of
	 * TransferAndReferences/TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut15(TransferOut15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate may
	 * be present in one or more occurrences of
	 * TransferAndReferences/TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut17(TransferOut17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn14(TransferIn14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate may
	 * be present in one or more occurrences of
	 * TransferAndReferences/TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn15(TransferIn15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut16(TransferOut16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}