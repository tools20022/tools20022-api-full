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
import com.tools20022.repository.area.seev.*;
import java.util.Arrays;

/**
 * If ChangeInstructionIndicator is 'true' or '1' (Yes), then
 * InstructionCancellationRequestIdentification must be present.
 */
public class ConstraintInstructionCancellationRequestIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
	 * CorporateActionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV07
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> forCorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV07;
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07
	 * CorporateActionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV08
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV06
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV07> forCorporateActionInstructionV07 = new MMConstraint<CorporateActionInstructionV07>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV06;
			owner_lazy = () -> CorporateActionInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V07
	 * CorporateActionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V07> forCorporateActionInstruction002V07 = new MMConstraint<CorporateActionInstruction002V07>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present.";
			owner_lazy = () -> CorporateActionInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01
	 * CorporateActionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV01> forCorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present.";
			owner_lazy = () -> CorporateActionInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02
	 * CorporateActionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV02> forCorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present.";
			owner_lazy = () -> CorporateActionInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03
	 * CorporateActionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV03> forCorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present.";
			owner_lazy = () -> CorporateActionInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04
	 * CorporateActionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV05
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> forCorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05
	 * CorporateActionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV06
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV04
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> forCorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If Identification/ChangeInstructionIndicator is YES (True), then InstructionCancellationRequestIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06
	 * CorporateActionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationRequestIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV07
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule#forCorporateActionInstructionV05
	 * ConstraintInstructionCancellationRequestIdentificationRule.
	 * forCorporateActionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV06> forCorporateActionInstructionV06 = new MMConstraint<CorporateActionInstructionV06>() {
		{
			validator = ConstraintInstructionCancellationRequestIdentificationRule::checkCorporateActionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationRequestIdentificationRule";
			definition = "If ChangeInstructionIndicator is 'true' or '1' (Yes), then InstructionCancellationRequestIdentification must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintInstructionCancellationRequestIdentificationRule.forCorporateActionInstructionV05;
			owner_lazy = () -> CorporateActionInstructionV06.mmObject();
		}
	};

	/**
	 * If ChangeInstructionIndicator is 'true' or '1' (Yes), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChangeInstructionIndicator is 'true' or '1' (Yes), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV07(CorporateActionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChangeInstructionIndicator is 'true' or '1' (Yes), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstruction002V07(CorporateActionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Identification/ChangeInstructionIndicator is YES (True), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Identification/ChangeInstructionIndicator is YES (True), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Identification/ChangeInstructionIndicator is YES (True), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Identification/ChangeInstructionIndicator is YES (True), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If Identification/ChangeInstructionIndicator is YES (True), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If ChangeInstructionIndicator is 'true' or '1' (Yes), then
	 * InstructionCancellationRequestIdentification must be present.
	 */
	public static void checkCorporateActionInstructionV06(CorporateActionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}