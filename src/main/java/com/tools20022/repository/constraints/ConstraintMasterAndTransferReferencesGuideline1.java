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
 * TransferReference, ClientReference and CounterpartyReference may each be
 * repeated across multiple instances of the TransferDetails component where the
 * respective party has allocated only a single reference to all transfers
 * within the instruction. Where the instructing party allocates a master
 * reference to link several transfers together, but does not allocate
 * individual references at transfer level, it should repeat that reference in
 * the MasterReference and each instance of TransferReference.
 */
public class ConstraintMasterAndTransferReferencesGuideline1 {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer15 Transfer15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAndTransferReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer15> forTransfer15 = new MMConstraint<Transfer15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAndTransferReferencesGuideline1";
			definition = "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference.";
			owner_lazy = () -> Transfer15.mmObject();
		}

		@Override
		public void executeValidator(Transfer15 obj) throws Exception {
			checkTransfer15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer19 Transfer19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAndTransferReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1#forTransfer27
	 * ConstraintMasterAndTransferReferencesGuideline1.forTransfer27}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer19> forTransfer19 = new MMConstraint<Transfer19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAndTransferReferencesGuideline1";
			definition = "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1.forTransfer27);
			owner_lazy = () -> Transfer19.mmObject();
		}

		@Override
		public void executeValidator(Transfer19 obj) throws Exception {
			checkTransfer19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer27 Transfer27}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAndTransferReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1#forTransfer30
	 * ConstraintMasterAndTransferReferencesGuideline1.forTransfer30}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1#forTransfer19
	 * ConstraintMasterAndTransferReferencesGuideline1.forTransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer27> forTransfer27 = new MMConstraint<Transfer27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAndTransferReferencesGuideline1";
			definition = "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1.forTransfer30);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1.forTransfer19;
			owner_lazy = () -> Transfer27.mmObject();
		}

		@Override
		public void executeValidator(Transfer27 obj) throws Exception {
			checkTransfer27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer32 Transfer32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAndTransferReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1#forTransfer21
	 * ConstraintMasterAndTransferReferencesGuideline1.forTransfer21}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer32> forTransfer32 = new MMConstraint<Transfer32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAndTransferReferencesGuideline1";
			definition = "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1.forTransfer21;
			owner_lazy = () -> Transfer32.mmObject();
		}

		@Override
		public void executeValidator(Transfer32 obj) throws Exception {
			checkTransfer32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30 Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAndTransferReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1#forTransfer27
	 * ConstraintMasterAndTransferReferencesGuideline1.forTransfer27}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer30> forTransfer30 = new MMConstraint<Transfer30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAndTransferReferencesGuideline1";
			definition = "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1.forTransfer27;
			owner_lazy = () -> Transfer30.mmObject();
		}

		@Override
		public void executeValidator(Transfer30 obj) throws Exception {
			checkTransfer30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer21 Transfer21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAndTransferReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1#forTransfer32
	 * ConstraintMasterAndTransferReferencesGuideline1.forTransfer32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer21> forTransfer21 = new MMConstraint<Transfer21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAndTransferReferencesGuideline1";
			definition = "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMasterAndTransferReferencesGuideline1.forTransfer32);
			owner_lazy = () -> Transfer21.mmObject();
		}

		@Override
		public void executeValidator(Transfer21 obj) throws Exception {
			checkTransfer21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer11 Transfer11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterAndTransferReferencesGuideline1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer11> forTransfer11 = new MMConstraint<Transfer11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterAndTransferReferencesGuideline1";
			definition = "TransferReference, ClientReference and CounterpartyReference may each be repeated across multiple instances of the TransferDetails component where the respective party has allocated only a single reference to all transfers within the instruction. Where the instructing party allocates a master reference to link several transfers together, but does not allocate individual references at transfer level, it should repeat that reference in the MasterReference and each instance of TransferReference.";
			owner_lazy = () -> Transfer11.mmObject();
		}

		@Override
		public void executeValidator(Transfer11 obj) throws Exception {
			checkTransfer11(obj);
		}
	};

	/**
	 * TransferReference, ClientReference and CounterpartyReference may each be
	 * repeated across multiple instances of the TransferDetails component where
	 * the respective party has allocated only a single reference to all
	 * transfers within the instruction. Where the instructing party allocates a
	 * master reference to link several transfers together, but does not
	 * allocate individual references at transfer level, it should repeat that
	 * reference in the MasterReference and each instance of TransferReference.
	 */
	public static void checkTransfer15(Transfer15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferReference, ClientReference and CounterpartyReference may each be
	 * repeated across multiple instances of the TransferDetails component where
	 * the respective party has allocated only a single reference to all
	 * transfers within the instruction. Where the instructing party allocates a
	 * master reference to link several transfers together, but does not
	 * allocate individual references at transfer level, it should repeat that
	 * reference in the MasterReference and each instance of TransferReference.
	 */
	public static void checkTransfer19(Transfer19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferReference, ClientReference and CounterpartyReference may each be
	 * repeated across multiple instances of the TransferDetails component where
	 * the respective party has allocated only a single reference to all
	 * transfers within the instruction. Where the instructing party allocates a
	 * master reference to link several transfers together, but does not
	 * allocate individual references at transfer level, it should repeat that
	 * reference in the MasterReference and each instance of TransferReference.
	 */
	public static void checkTransfer27(Transfer27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferReference, ClientReference and CounterpartyReference may each be
	 * repeated across multiple instances of the TransferDetails component where
	 * the respective party has allocated only a single reference to all
	 * transfers within the instruction. Where the instructing party allocates a
	 * master reference to link several transfers together, but does not
	 * allocate individual references at transfer level, it should repeat that
	 * reference in the MasterReference and each instance of TransferReference.
	 */
	public static void checkTransfer32(Transfer32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferReference, ClientReference and CounterpartyReference may each be
	 * repeated across multiple instances of the TransferDetails component where
	 * the respective party has allocated only a single reference to all
	 * transfers within the instruction. Where the instructing party allocates a
	 * master reference to link several transfers together, but does not
	 * allocate individual references at transfer level, it should repeat that
	 * reference in the MasterReference and each instance of TransferReference.
	 */
	public static void checkTransfer30(Transfer30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferReference, ClientReference and CounterpartyReference may each be
	 * repeated across multiple instances of the TransferDetails component where
	 * the respective party has allocated only a single reference to all
	 * transfers within the instruction. Where the instructing party allocates a
	 * master reference to link several transfers together, but does not
	 * allocate individual references at transfer level, it should repeat that
	 * reference in the MasterReference and each instance of TransferReference.
	 */
	public static void checkTransfer21(Transfer21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TransferReference, ClientReference and CounterpartyReference may each be
	 * repeated across multiple instances of the TransferDetails component where
	 * the respective party has allocated only a single reference to all
	 * transfers within the instruction. Where the instructing party allocates a
	 * master reference to link several transfers together, but does not
	 * allocate individual references at transfer level, it should repeat that
	 * reference in the MasterReference and each instance of TransferReference.
	 */
	public static void checkTransfer11(Transfer11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}