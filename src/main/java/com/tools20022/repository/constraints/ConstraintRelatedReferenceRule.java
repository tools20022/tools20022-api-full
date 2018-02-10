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
import java.util.Arrays;

/**
 * If Reference/RelatedReference/MessageName is present, it must start with
 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
 */
public class ConstraintRelatedReferenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV05
	 * TransferInstructionStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferInstructionStatusReportV04
	 * ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV05> forTransferInstructionStatusReportV05 = new MMConstraint<TransferInstructionStatusReportV05>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferInstructionStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV04;
			owner_lazy = () -> TransferInstructionStatusReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV05
	 * TransferCancellationStatusReportV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferCancellationStatusReportV04
	 * ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV05> forTransferCancellationStatusReportV05 = new MMConstraint<TransferCancellationStatusReportV05>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferCancellationStatusReportV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV04;
			owner_lazy = () -> TransferCancellationStatusReportV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV04
	 * TransferInstructionStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferInstructionStatusReportV05
	 * ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferInstructionStatusReportV03
	 * ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV04> forTransferInstructionStatusReportV04 = new MMConstraint<TransferInstructionStatusReportV04>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferInstructionStatusReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV03;
			owner_lazy = () -> TransferInstructionStatusReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV04
	 * TransferCancellationStatusReportV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferCancellationStatusReportV05
	 * ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferCancellationStatusReportV03
	 * ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV04> forTransferCancellationStatusReportV04 = new MMConstraint<TransferCancellationStatusReportV04>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferCancellationStatusReportV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV03;
			owner_lazy = () -> TransferCancellationStatusReportV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV02
	 * TransferCancellationStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.002, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV02> forTransferCancellationStatusReportV02 = new MMConstraint<TransferCancellationStatusReportV02>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferCancellationStatusReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.002, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			owner_lazy = () -> TransferCancellationStatusReportV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV03
	 * TransferCancellationStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.002, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferCancellationStatusReportV04
	 * ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV03> forTransferCancellationStatusReportV03 = new MMConstraint<TransferCancellationStatusReportV03>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferCancellationStatusReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.002, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferCancellationStatusReportV04);
			owner_lazy = () -> TransferCancellationStatusReportV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV02
	 * TransferInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV02> forTransferInstructionStatusReportV02 = new MMConstraint<TransferInstructionStatusReportV02>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferInstructionStatusReportV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			owner_lazy = () -> TransferInstructionStatusReportV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV03
	 * TransferInstructionStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#forTransferInstructionStatusReportV04
	 * ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV03> forTransferInstructionStatusReportV03 = new MMConstraint<TransferInstructionStatusReportV03>() {
		{
			validator = ConstraintRelatedReferenceRule::checkTransferInstructionStatusReportV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.forTransferInstructionStatusReportV04);
			owner_lazy = () -> TransferInstructionStatusReportV03.mmObject();
		}
	};

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
	 */
	public static void checkTransferInstructionStatusReportV05(TransferInstructionStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.002, sese.006, sese.009 or sese.014.
	 */
	public static void checkTransferCancellationStatusReportV05(TransferCancellationStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
	 */
	public static void checkTransferInstructionStatusReportV04(TransferInstructionStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.002, sese.006, sese.009 or sese.014.
	 */
	public static void checkTransferCancellationStatusReportV04(TransferCancellationStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.002, sese.006 or sese.009 and the
	 * RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void checkTransferCancellationStatusReportV02(TransferCancellationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.002, sese.006 or sese.009 and the
	 * RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void checkTransferCancellationStatusReportV03(TransferCancellationStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and
	 * the RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void checkTransferInstructionStatusReportV02(TransferInstructionStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and
	 * the RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void checkTransferInstructionStatusReportV03(TransferInstructionStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}