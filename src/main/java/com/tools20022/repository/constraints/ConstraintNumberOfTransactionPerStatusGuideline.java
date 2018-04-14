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
 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only
 * be present if GroupStatus equals 'PART'.
 */
public class ConstraintNumberOfTransactionPerStatusGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1
	 * OriginalGroupInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation1> forOriginalGroupInformation1 = new MMConstraint<OriginalGroupInformation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			owner_lazy = () -> OriginalGroupInformation1.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation1 obj) throws Exception {
			checkOriginalGroupInformation1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupInformation28
	 * ConstraintNumberOfTransactionPerStatusGuideline.
	 * forOriginalGroupInformation28}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation25> forOriginalGroupInformation25 = new MMConstraint<OriginalGroupInformation25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupInformation28);
			owner_lazy = () -> OriginalGroupInformation25.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation25 obj) throws Exception {
			checkOriginalGroupInformation25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
	 * OriginalGroupHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupHeader13
	 * ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader13}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupHeader1
	 * ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader1}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader7> forOriginalGroupHeader7 = new MMConstraint<OriginalGroupHeader7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader13);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader1;
			owner_lazy = () -> OriginalGroupHeader7.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupHeader7 obj) throws Exception {
			checkOriginalGroupHeader7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation20
	 * OriginalGroupInformation20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation20> forOriginalGroupInformation20 = new MMConstraint<OriginalGroupInformation20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			owner_lazy = () -> OriginalGroupInformation20.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation20 obj) throws Exception {
			checkOriginalGroupInformation20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation19
	 * OriginalGroupInformation19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nOriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation19> forOriginalGroupInformation19 = new MMConstraint<OriginalGroupInformation19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "ISO20022 Rule: \nOriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			owner_lazy = () -> OriginalGroupInformation19.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation19 obj) throws Exception {
			checkOriginalGroupInformation19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ISO20022 Rule: \nOriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation15> forOriginalGroupInformation15 = new MMConstraint<OriginalGroupInformation15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "ISO20022 Rule: \nOriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			owner_lazy = () -> OriginalGroupInformation15.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation15 obj) throws Exception {
			checkOriginalGroupInformation15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader13
	 * OriginalGroupHeader13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupHeader7
	 * ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader7}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader13> forOriginalGroupHeader13 = new MMConstraint<OriginalGroupHeader13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader7;
			owner_lazy = () -> OriginalGroupHeader13.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupHeader13 obj) throws Exception {
			checkOriginalGroupHeader13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupHeader7
	 * ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader7}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader1> forOriginalGroupHeader1 = new MMConstraint<OriginalGroupHeader1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader7);
			owner_lazy = () -> OriginalGroupHeader1.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupHeader1 obj) throws Exception {
			checkOriginalGroupHeader1(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28
	 * OriginalGroupInformation28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionPerStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupInformation25
	 * ConstraintNumberOfTransactionPerStatusGuideline.
	 * forOriginalGroupInformation25}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation28> forOriginalGroupInformation28 = new MMConstraint<OriginalGroupInformation28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionPerStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupStatus equals 'PART'.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupInformation25;
			owner_lazy = () -> OriginalGroupInformation28.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation28 obj) throws Exception {
			checkOriginalGroupInformation28(obj);
		}
	};

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupInformation1(OriginalGroupInformation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupInformation25(OriginalGroupInformation25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupHeader7(OriginalGroupHeader7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupInformation20(OriginalGroupInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule:
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupInformation19(OriginalGroupInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * ISO20022 Rule:
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupInformation15(OriginalGroupInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupHeader13(OriginalGroupHeader13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupHeader1(OriginalGroupHeader1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupStatus equals 'PART'.
	 */
	public static void checkOriginalGroupInformation28(OriginalGroupInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}