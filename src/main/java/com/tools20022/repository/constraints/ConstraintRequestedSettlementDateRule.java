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
 * Either TransferDetails/RequestedSettlementDate or
 * SettlementDetails/RequestedSettlementDate may be present, but not both.
 */
public class ConstraintRequestedSettlementDateRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV05
	 * TransferOutInstructionV05}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV04
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV05> for_sese_TransferOutInstructionV05 = new MMConstraint<TransferOutInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV04;
			owner_lazy = () -> TransferOutInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(TransferOutInstructionV05 obj) throws Exception {
			check_sese_TransferOutInstructionV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn10 TransferIn10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn7;
			owner_lazy = () -> TransferIn10.mmObject();
		}

		@Override
		public void executeValidator(TransferIn10 obj) throws Exception {
			checkTransferIn10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut11 TransferOut11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut9;
			owner_lazy = () -> TransferOut11.mmObject();
		}

		@Override
		public void executeValidator(TransferOut11 obj) throws Exception {
			checkTransferOut11(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV04> for_sese_TransferInConfirmationV04 = new MMConstraint<TransferInConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV05);
			owner_lazy = () -> TransferInConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV04 obj) throws Exception {
			check_sese_TransferInConfirmationV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV08
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV08}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV07> for_sese_TransferInConfirmationV07 = new MMConstraint<TransferInConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV06;
			owner_lazy = () -> TransferInConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV07 obj) throws Exception {
			check_sese_TransferInConfirmationV07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV07}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV08> for_sese_TransferOutInstructionV08 = new MMConstraint<TransferOutInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV07;
			owner_lazy = () -> TransferOutInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(TransferOutInstructionV08 obj) throws Exception {
			check_sese_TransferOutInstructionV08(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV06}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV04
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV04}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV05> for_sese_TransferInConfirmationV05 = new MMConstraint<TransferInConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV04;
			owner_lazy = () -> TransferInConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV05 obj) throws Exception {
			check_sese_TransferInConfirmationV05(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn13 TransferIn13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn15);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn10;
			owner_lazy = () -> TransferIn13.mmObject();
		}

		@Override
		public void executeValidator(TransferIn13 obj) throws Exception {
			checkTransferIn13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut14 TransferOut14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut16);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut12;
			owner_lazy = () -> TransferOut14.mmObject();
		}

		@Override
		public void executeValidator(TransferOut14 obj) throws Exception {
			checkTransferOut14(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV06
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV04
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV04
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV05> for_sese_TransferOutConfirmationV05 = new MMConstraint<TransferOutConfirmationV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV04;
			owner_lazy = () -> TransferOutConfirmationV05.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV05 obj) throws Exception {
			check_sese_TransferOutConfirmationV05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV04> for_sese_TransferInInstructionV04 = new MMConstraint<TransferInInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV05);
			owner_lazy = () -> TransferInInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(TransferInInstructionV04 obj) throws Exception {
			check_sese_TransferInInstructionV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08
	 * TransferInConfirmationV08}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV07}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV08> for_sese_TransferInConfirmationV08 = new MMConstraint<TransferInConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV07;
			owner_lazy = () -> TransferInConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV08 obj) throws Exception {
			check_sese_TransferInConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn7 TransferIn7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn10);
			owner_lazy = () -> TransferIn7.mmObject();
		}

		@Override
		public void executeValidator(TransferIn7 obj) throws Exception {
			checkTransferIn7(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV05
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV04> for_sese_TransferOutConfirmationV04 = new MMConstraint<TransferOutConfirmationV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV05);
			owner_lazy = () -> TransferOutConfirmationV04.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV04 obj) throws Exception {
			check_sese_TransferOutConfirmationV04(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut17 TransferOut17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut15
	 * ConstraintRequestedSettlementDateRule.forTransferOut15}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut17> forTransferOut17 = new MMConstraint<TransferOut17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut15;
			owner_lazy = () -> TransferOut17.mmObject();
		}

		@Override
		public void executeValidator(TransferOut17 obj) throws Exception {
			checkTransferOut17(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV08
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV07> for_sese_TransferInInstructionV07 = new MMConstraint<TransferInInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV06;
			owner_lazy = () -> TransferInInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(TransferInInstructionV07 obj) throws Exception {
			check_sese_TransferInInstructionV07(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn14 TransferIn14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn12
	 * ConstraintRequestedSettlementDateRule.forTransferIn12}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn14> forTransferIn14 = new MMConstraint<TransferIn14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn12;
			owner_lazy = () -> TransferIn14.mmObject();
		}

		@Override
		public void executeValidator(TransferIn14 obj) throws Exception {
			checkTransferIn14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut16 TransferOut16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferOut14
	 * ConstraintRequestedSettlementDateRule.forTransferOut14}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOut16> forTransferOut16 = new MMConstraint<TransferOut16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut14;
			owner_lazy = () -> TransferOut16.mmObject();
		}

		@Override
		public void executeValidator(TransferOut16 obj) throws Exception {
			checkTransferOut16(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV05}
	 * </li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV04> for_sese_TransferOutInstructionV04 = new MMConstraint<TransferOutInstructionV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV05);
			owner_lazy = () -> TransferOutInstructionV04.mmObject();
		}

		@Override
		public void executeValidator(TransferOutInstructionV04 obj) throws Exception {
			check_sese_TransferOutInstructionV04(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV06> for_sese_TransferInInstructionV06 = new MMConstraint<TransferInInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV05;
			owner_lazy = () -> TransferInInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(TransferInInstructionV06 obj) throws Exception {
			check_sese_TransferInInstructionV06(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInConfirmationV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInConfirmationV06> for_sese_TransferInConfirmationV06 = new MMConstraint<TransferInConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInConfirmationV05;
			owner_lazy = () -> TransferInConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(TransferInConfirmationV06 obj) throws Exception {
			check_sese_TransferInConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn9 TransferIn9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn12);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn8;
			owner_lazy = () -> TransferIn9.mmObject();
		}

		@Override
		public void executeValidator(TransferIn9 obj) throws Exception {
			checkTransferIn9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn8 TransferIn8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn9);
			owner_lazy = () -> TransferIn8.mmObject();
		}

		@Override
		public void executeValidator(TransferIn8 obj) throws Exception {
			checkTransferIn8(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV08> for_sese_TransferInInstructionV08 = new MMConstraint<TransferInInstructionV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV07;
			owner_lazy = () -> TransferInInstructionV08.mmObject();
		}

		@Override
		public void executeValidator(TransferInInstructionV08 obj) throws Exception {
			check_sese_TransferInInstructionV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn15 TransferIn15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#forTransferIn13
	 * ConstraintRequestedSettlementDateRule.forTransferIn13}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferIn15> forTransferIn15 = new MMConstraint<TransferIn15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn13;
			owner_lazy = () -> TransferIn15.mmObject();
		}

		@Override
		public void executeValidator(TransferIn15 obj) throws Exception {
			checkTransferIn15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut15 TransferOut15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferAndReferences/TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferAndReferences/TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut11;
			owner_lazy = () -> TransferOut15.mmObject();
		}

		@Override
		public void executeValidator(TransferOut15 obj) throws Exception {
			checkTransferOut15(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV07
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV05
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV06> for_sese_TransferOutConfirmationV06 = new MMConstraint<TransferOutConfirmationV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV05;
			owner_lazy = () -> TransferOutConfirmationV06.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV06 obj) throws Exception {
			check_sese_TransferOutConfirmationV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut10 TransferOut10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut12);
			owner_lazy = () -> TransferOut10.mmObject();
		}

		@Override
		public void executeValidator(TransferOut10 obj) throws Exception {
			checkTransferOut10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut9 TransferOut9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or \r\nSettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or \r\nSettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut11);
			owner_lazy = () -> TransferOut9.mmObject();
		}

		@Override
		public void executeValidator(TransferOut9 obj) throws Exception {
			checkTransferOut9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferIn12 TransferIn12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferIn9;
			owner_lazy = () -> TransferIn12.mmObject();
		}

		@Override
		public void executeValidator(TransferIn12 obj) throws Exception {
			checkTransferIn12(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferInInstructionV04
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInInstructionV05> for_sese_TransferInInstructionV05 = new MMConstraint<TransferInInstructionV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails\\RequestedSettlementDate or SettlementDetails\\RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferInInstructionV04;
			owner_lazy = () -> TransferInInstructionV05.mmObject();
		}

		@Override
		public void executeValidator(TransferInInstructionV05 obj) throws Exception {
			check_sese_TransferInInstructionV05(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV07
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV08> for_sese_TransferOutConfirmationV08 = new MMConstraint<TransferOutConfirmationV08>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV07;
			owner_lazy = () -> TransferOutConfirmationV08.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV08 obj) throws Exception {
			check_sese_TransferOutConfirmationV08(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.TransferOut12 TransferOut12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.forTransferOut10;
			owner_lazy = () -> TransferOut12.mmObject();
		}

		@Override
		public void executeValidator(TransferOut12 obj) throws Exception {
			checkTransferOut12(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV08
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV08
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutConfirmationV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV06
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutConfirmationV07> for_sese_TransferOutConfirmationV07 = new MMConstraint<TransferOutConfirmationV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutConfirmationV06;
			owner_lazy = () -> TransferOutConfirmationV07.mmObject();
		}

		@Override
		public void executeValidator(TransferOutConfirmationV07 obj) throws Exception {
			check_sese_TransferOutConfirmationV07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV08
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV08}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV06
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV06}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV07> for_sese_TransferOutInstructionV07 = new MMConstraint<TransferOutInstructionV07>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV06;
			owner_lazy = () -> TransferOutInstructionV07.mmObject();
		}

		@Override
		public void executeValidator(TransferOutInstructionV07 obj) throws Exception {
			check_sese_TransferOutInstructionV07(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV07
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV07}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule#for_sese_TransferOutInstructionV05
	 * ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV05}
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferOutInstructionV06> for_sese_TransferOutInstructionV06 = new MMConstraint<TransferOutInstructionV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDateRule";
			definition = "Either TransferDetails/RequestedSettlementDate may be present in one or more occurrences of TransferDetails or SettlementDetails/RequestedSettlementDate may be present, but not both.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRequestedSettlementDateRule.for_sese_TransferOutInstructionV05;
			owner_lazy = () -> TransferOutInstructionV06.mmObject();
		}

		@Override
		public void executeValidator(TransferOutInstructionV06 obj) throws Exception {
			check_sese_TransferOutInstructionV06(obj);
		}
	};

	/**
	 * Either TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutInstructionV05(TransferOutInstructionV05 obj) throws Exception {
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
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut11(TransferOut11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV04(TransferInConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV07(TransferInConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutInstructionV08(TransferOutInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV05(TransferInConfirmationV05 obj) throws Exception {
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
	 * Either TransferDetails/RequestedSettlementDate or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV05(TransferOutConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInInstructionV04(TransferInInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV08(TransferInConfirmationV08 obj) throws Exception {
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
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV04(TransferOutConfirmationV04 obj) throws Exception {
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
	public static void check_sese_TransferInInstructionV07(TransferInInstructionV07 obj) throws Exception {
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
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut16(TransferOut16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutInstructionV04(TransferOutInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInInstructionV06(TransferInInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInConfirmationV06(TransferInConfirmationV06 obj) throws Exception {
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
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferIn8(TransferIn8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInInstructionV08(TransferInInstructionV08 obj) throws Exception {
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
	 * Either TransferAndReferences/TransferDetails/RequestedSettlementDate may
	 * be present in one or more occurrences of
	 * TransferAndReferences/TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut15(TransferOut15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV06(TransferOutConfirmationV06 obj) throws Exception {
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
	 * Either TransferDetails\RequestedSettlementDate or <br>
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void checkTransferOut9(TransferOut9 obj) throws Exception {
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
	 * Either TransferDetails\RequestedSettlementDate or
	 * SettlementDetails\RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferInInstructionV05(TransferInInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV08(TransferOutConfirmationV08 obj) throws Exception {
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
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutConfirmationV07(TransferOutConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutInstructionV07(TransferOutInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Either TransferDetails/RequestedSettlementDate may be present in one or
	 * more occurrences of TransferDetails or
	 * SettlementDetails/RequestedSettlementDate may be present, but not both.
	 */
	public static void check_sese_TransferOutInstructionV06(TransferOutInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}