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
 * be present if GroupCancellationStatus equals PACR.
 */
public class ConstraintNumberOfTransactionsPerCancellationStatusGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader5
	 * OriginalGroupHeader5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalGroupHeader9
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalGroupHeader9}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader5> forOriginalGroupHeader5 = new MMConstraint<OriginalGroupHeader5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalGroupHeader9);
			owner_lazy = () -> OriginalGroupHeader5.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupHeader5 obj) throws Exception {
			checkOriginalGroupHeader5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction3
	 * OriginalPaymentInstruction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction10
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction10}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction3> forOriginalPaymentInstruction3 = new MMConstraint<OriginalPaymentInstruction3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction10);
			owner_lazy = () -> OriginalPaymentInstruction3.mmObject();
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction3 obj) throws Exception {
			checkOriginalPaymentInstruction3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction10
	 * OriginalPaymentInstruction10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction17
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction3
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction3}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction10> forOriginalPaymentInstruction10 = new MMConstraint<OriginalPaymentInstruction10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction3;
			owner_lazy = () -> OriginalPaymentInstruction10.mmObject();
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction10 obj) throws Exception {
			checkOriginalPaymentInstruction10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader9
	 * OriginalGroupHeader9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalGroupHeader5
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalGroupHeader5}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupHeader9> forOriginalGroupHeader9 = new MMConstraint<OriginalGroupHeader9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalGroupHeader5;
			owner_lazy = () -> OriginalGroupHeader9.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupHeader9 obj) throws Exception {
			checkOriginalGroupHeader9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction17
	 * OriginalPaymentInstruction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction22
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction10
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction10}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction17> forOriginalPaymentInstruction17 = new MMConstraint<OriginalPaymentInstruction17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction10;
			owner_lazy = () -> OriginalPaymentInstruction17.mmObject();
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction17 obj) throws Exception {
			checkOriginalPaymentInstruction17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction26
	 * OriginalPaymentInstruction26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction22
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction22}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction26> forOriginalPaymentInstruction26 = new MMConstraint<OriginalPaymentInstruction26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest).";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction22;
			owner_lazy = () -> OriginalPaymentInstruction26.mmObject();
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction26 obj) throws Exception {
			checkOriginalPaymentInstruction26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation24
	 * OriginalGroupInformation24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalGroupInformation24> forOriginalGroupInformation24 = new MMConstraint<OriginalGroupInformation24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR.";
			owner_lazy = () -> OriginalGroupInformation24.mmObject();
		}

		@Override
		public void executeValidator(OriginalGroupInformation24 obj) throws Exception {
			checkOriginalGroupInformation24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22
	 * OriginalPaymentInstruction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction26
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction26}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline#forOriginalPaymentInstruction17
	 * ConstraintNumberOfTransactionsPerCancellationStatusGuideline.
	 * forOriginalPaymentInstruction17}</li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInstruction22> forOriginalPaymentInstruction22 = new MMConstraint<OriginalPaymentInstruction22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR (PartialCancellationRequest).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction26);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintNumberOfTransactionsPerCancellationStatusGuideline.forOriginalPaymentInstruction17;
			owner_lazy = () -> OriginalPaymentInstruction22.mmObject();
		}

		@Override
		public void executeValidator(OriginalPaymentInstruction22 obj) throws Exception {
			checkOriginalPaymentInstruction22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInformation3
	 * OriginalPaymentInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerCancellationStatusGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<OriginalPaymentInformation3> forOriginalPaymentInformation3 = new MMConstraint<OriginalPaymentInformation3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerCancellationStatusGuideline";
			definition = "OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should only be present if GroupCancellationStatus equals PACR.";
			owner_lazy = () -> OriginalPaymentInformation3.mmObject();
		}

		@Override
		public void executeValidator(OriginalPaymentInformation3 obj) throws Exception {
			checkOriginalPaymentInformation3(obj);
		}
	};

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR.
	 */
	public static void checkOriginalGroupHeader5(OriginalGroupHeader5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR.
	 */
	public static void checkOriginalPaymentInstruction3(OriginalPaymentInstruction3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR.
	 */
	public static void checkOriginalPaymentInstruction10(OriginalPaymentInstruction10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR.
	 */
	public static void checkOriginalGroupHeader9(OriginalGroupHeader9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR
	 * (PartialCancellationRequest).
	 */
	public static void checkOriginalPaymentInstruction17(OriginalPaymentInstruction17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR
	 * (PartialCancellationRequest).
	 */
	public static void checkOriginalPaymentInstruction26(OriginalPaymentInstruction26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR.
	 */
	public static void checkOriginalGroupInformation24(OriginalGroupInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR
	 * (PartialCancellationRequest).
	 */
	public static void checkOriginalPaymentInstruction22(OriginalPaymentInstruction22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * OriginalGroupInformationAndStatus/NumberOfTransactionsPerStatus should
	 * only be present if GroupCancellationStatus equals PACR.
	 */
	public static void checkOriginalPaymentInformation3(OriginalPaymentInformation3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}