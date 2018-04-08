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
	 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06
	 * TransferInstructionStatusReportV06}</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferInstructionStatusReportV05
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferInstructionStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV06> for_sese_TransferInstructionStatusReportV06 = new MMConstraint<TransferInstructionStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV05;
			owner_lazy = () -> TransferInstructionStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV06 obj) throws Exception {
			check_sese_TransferInstructionStatusReportV06(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06
	 * TransferCancellationStatusReportV06}</li>
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV05
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferCancellationStatusReportV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV06> for_sese_TransferCancellationStatusReportV06 = new MMConstraint<TransferCancellationStatusReportV06>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV05;
			owner_lazy = () -> TransferCancellationStatusReportV06.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV06 obj) throws Exception {
			check_sese_TransferCancellationStatusReportV06(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferInstructionStatusReportV04
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferInstructionStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV03> for_sese_TransferInstructionStatusReportV03 = new MMConstraint<TransferInstructionStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV04);
			owner_lazy = () -> TransferInstructionStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV03 obj) throws Exception {
			check_sese_TransferInstructionStatusReportV03(obj);
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferInstructionStatusReportV06
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferInstructionStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferInstructionStatusReportV04
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferInstructionStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV05> for_sese_TransferInstructionStatusReportV05 = new MMConstraint<TransferInstructionStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV04;
			owner_lazy = () -> TransferInstructionStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV05 obj) throws Exception {
			check_sese_TransferInstructionStatusReportV05(obj);
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
	public static final MMConstraint<TransferInstructionStatusReportV02> for_sese_TransferInstructionStatusReportV02 = new MMConstraint<TransferInstructionStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			owner_lazy = () -> TransferInstructionStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV02 obj) throws Exception {
			check_sese_TransferInstructionStatusReportV02(obj);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV06
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferCancellationStatusReportV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV04
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferCancellationStatusReportV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV05> for_sese_TransferCancellationStatusReportV05 = new MMConstraint<TransferCancellationStatusReportV05>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV04;
			owner_lazy = () -> TransferCancellationStatusReportV05.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV05 obj) throws Exception {
			check_sese_TransferCancellationStatusReportV05(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferInstructionStatusReportV05
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferInstructionStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferInstructionStatusReportV03
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferInstructionStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferInstructionStatusReportV04> for_sese_TransferInstructionStatusReportV04 = new MMConstraint<TransferInstructionStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferInstructionStatusReportV03;
			owner_lazy = () -> TransferInstructionStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(TransferInstructionStatusReportV04 obj) throws Exception {
			check_sese_TransferInstructionStatusReportV04(obj);
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
	public static final MMConstraint<TransferCancellationStatusReportV02> for_sese_TransferCancellationStatusReportV02 = new MMConstraint<TransferCancellationStatusReportV02>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.002, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			owner_lazy = () -> TransferCancellationStatusReportV02.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV02 obj) throws Exception {
			check_sese_TransferCancellationStatusReportV02(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV04
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferCancellationStatusReportV04}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV03> for_sese_TransferCancellationStatusReportV03 = new MMConstraint<TransferCancellationStatusReportV03>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If RelatedReference/MessageName is present, it must contain 540 or 542 or must start with sese.002, sese.006 or sese.009 and the RelatedReference/Reference must contain the reference of a message in this list.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV04);
			owner_lazy = () -> TransferCancellationStatusReportV03.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV03 obj) throws Exception {
			check_sese_TransferCancellationStatusReportV03(obj);
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
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV05
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferCancellationStatusReportV05}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV03
	 * ConstraintRelatedReferenceRule.
	 * for_sese_TransferCancellationStatusReportV03}</li>
	 * </ul>
	 */
	public static final MMConstraint<TransferCancellationStatusReportV04> for_sese_TransferCancellationStatusReportV04 = new MMConstraint<TransferCancellationStatusReportV04>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceRule";
			definition = "If Reference/RelatedReference/MessageName is present, it must start with sese.002, sese.006, sese.009 or sese.014.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV05);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV03;
			owner_lazy = () -> TransferCancellationStatusReportV04.mmObject();
		}

		@Override
		public void executeValidator(TransferCancellationStatusReportV04 obj) throws Exception {
			check_sese_TransferCancellationStatusReportV04(obj);
		}
	};

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
	 */
	public static void check_sese_TransferInstructionStatusReportV06(TransferInstructionStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.002, sese.006, sese.009 or sese.014.
	 */
	public static void check_sese_TransferCancellationStatusReportV06(TransferCancellationStatusReportV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and
	 * the RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void check_sese_TransferInstructionStatusReportV03(TransferInstructionStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
	 */
	public static void check_sese_TransferInstructionStatusReportV05(TransferInstructionStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.001, sese.002, sese.005, sese.006 or sese.009 and
	 * the RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void check_sese_TransferInstructionStatusReportV02(TransferInstructionStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.002, sese.006, sese.009 or sese.014.
	 */
	public static void check_sese_TransferCancellationStatusReportV05(TransferCancellationStatusReportV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.001, sese.002, sese.005, sese.006, sese.009, sese.012 or sese.014.
	 */
	public static void check_sese_TransferInstructionStatusReportV04(TransferInstructionStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.002, sese.006 or sese.009 and the
	 * RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void check_sese_TransferCancellationStatusReportV02(TransferCancellationStatusReportV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If RelatedReference/MessageName is present, it must contain 540 or 542 or
	 * must start with sese.002, sese.006 or sese.009 and the
	 * RelatedReference/Reference must contain the reference of a message in
	 * this list.
	 */
	public static void check_sese_TransferCancellationStatusReportV03(TransferCancellationStatusReportV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Reference/RelatedReference/MessageName is present, it must start with
	 * sese.002, sese.006, sese.009 or sese.014.
	 */
	public static void check_sese_TransferCancellationStatusReportV04(TransferCancellationStatusReportV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}