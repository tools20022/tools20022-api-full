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
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * All elements in the AdditionalInformation sequence must not contain
 * information that can be provided in a structured field unless bilaterally
 * agreed or advised differently in the element definition as in
 * AdditionalInformation/NarrativeVersion.
 */
public class ConstraintAdditionalInformationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08
	 * CorporateActionMovementConfirmationV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV07
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV08> forCorporateActionMovementConfirmationV08 = new MMConstraint<CorporateActionMovementConfirmationV08>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV07;
			owner_lazy = () -> CorporateActionMovementConfirmationV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08
	 * CorporateActionMovementReversalAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV08> forCorporateActionMovementReversalAdviceV08 = new MMConstraint<CorporateActionMovementReversalAdviceV08>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV07;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV07
	 * CorporateActionInstructionCancellationRequestStatusAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV07> forCorporateActionInstructionCancellationRequestStatusAdviceV07 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV07>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV06;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV07.mmObject();
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionV06
	 * ConstraintAdditionalInformationRule.forCorporateActionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV07> forCorporateActionInstructionV07 = new MMConstraint<CorporateActionInstructionV07>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition. ";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionV06;
			owner_lazy = () -> CorporateActionInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV08
	 * CorporateActionInstructionStatusAdviceV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV08> forCorporateActionInstructionStatusAdviceV08 = new MMConstraint<CorporateActionInstructionStatusAdviceV08>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV07;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV08.mmObject();
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V07> forCorporateActionInstruction002V07 = new MMConstraint<CorporateActionInstruction002V07>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition. ";
			owner_lazy = () -> CorporateActionInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V08
	 * CorporateActionMovementReversalAdvice002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdvice002V08> forCorporateActionMovementReversalAdvice002V08 = new MMConstraint<CorporateActionMovementReversalAdvice002V08>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdvice002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdvice002V07
	 * CorporateActionInstructionCancellationRequestStatusAdvice002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdvice002V07> forCorporateActionInstructionCancellationRequestStatusAdvice002V07 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdvice002V07>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdvice002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdvice002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdvice002V08
	 * CorporateActionInstructionStatusAdvice002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdvice002V08> forCorporateActionInstructionStatusAdvice002V08 = new MMConstraint<CorporateActionInstructionStatusAdvice002V08>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdvice002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdvice002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V08
	 * CorporateActionMovementConfirmation002V08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmation002V08> forCorporateActionMovementConfirmation002V08 = new MMConstraint<CorporateActionMovementConfirmation002V08>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmation002V08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmation002V08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV06
	 * CorporateActionInstructionCancellationRequestStatusAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV06> forCorporateActionInstructionCancellationRequestStatusAdviceV06 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV06>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV05;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV06.mmObject();
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionV07
	 * ConstraintAdditionalInformationRule.forCorporateActionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionV05
	 * ConstraintAdditionalInformationRule.forCorporateActionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV06> forCorporateActionInstructionV06 = new MMConstraint<CorporateActionInstructionV06>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/AdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionV05;
			owner_lazy = () -> CorporateActionInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07
	 * CorporateActionMovementConfirmationV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV08
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV07> forCorporateActionMovementConfirmationV07 = new MMConstraint<CorporateActionMovementConfirmationV07>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in AdditionalInformation/NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV06;
			owner_lazy = () -> CorporateActionMovementConfirmationV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV07
	 * CorporateActionInstructionStatusAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV08
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV07> forCorporateActionInstructionStatusAdviceV07 = new MMConstraint<CorporateActionInstructionStatusAdviceV07>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV06;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07
	 * CorporateActionMovementReversalAdviceV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV08
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV07> forCorporateActionMovementReversalAdviceV07 = new MMConstraint<CorporateActionMovementReversalAdviceV07>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\r\ncontain information that can be provided in a structured field unless\r\nbilaterally agreed or advised differently in the element definition\r\nas in AdditionalInformation/NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV06;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV07.mmObject();
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV01> forCorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. ";
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV02> forCorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. ";
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. "
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV03> forCorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. ";
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionV05
	 * ConstraintAdditionalInformationRule.forCorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> forCorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV01
	 * CorporateActionInstructionCancellationRequestStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01> forCorporateActionInstructionCancellationRequestStatusAdviceV01 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV01>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV02
	 * CorporateActionInstructionCancellationRequestStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02> forCorporateActionInstructionCancellationRequestStatusAdviceV02 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV02>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV03
	 * CorporateActionInstructionCancellationRequestStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03> forCorporateActionInstructionCancellationRequestStatusAdviceV03 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV03>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV04
	 * CorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04> forCorporateActionInstructionCancellationRequestStatusAdviceV04 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV04>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV01
	 * CorporateActionInstructionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV01> forCorporateActionInstructionStatusAdviceV01 = new MMConstraint<CorporateActionInstructionStatusAdviceV01>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV02
	 * CorporateActionInstructionStatusAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV02> forCorporateActionInstructionStatusAdviceV02 = new MMConstraint<CorporateActionInstructionStatusAdviceV02>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV03
	 * CorporateActionInstructionStatusAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV03> forCorporateActionInstructionStatusAdviceV03 = new MMConstraint<CorporateActionInstructionStatusAdviceV03>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV04
	 * CorporateActionInstructionStatusAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV04> forCorporateActionInstructionStatusAdviceV04 = new MMConstraint<CorporateActionInstructionStatusAdviceV04>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV05);
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV01
	 * CorporateActionMovementConfirmationV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV01> forCorporateActionMovementConfirmationV01 = new MMConstraint<CorporateActionMovementConfirmationV01>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmationV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV02
	 * CorporateActionMovementConfirmationV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV02> forCorporateActionMovementConfirmationV02 = new MMConstraint<CorporateActionMovementConfirmationV02>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmationV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV03
	 * CorporateActionMovementConfirmationV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV03> forCorporateActionMovementConfirmationV03 = new MMConstraint<CorporateActionMovementConfirmationV03>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementConfirmationV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV04
	 * CorporateActionMovementConfirmationV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV04> forCorporateActionMovementConfirmationV04 = new MMConstraint<CorporateActionMovementConfirmationV04>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV05);
			owner_lazy = () -> CorporateActionMovementConfirmationV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV01
	 * CorporateActionMovementReversalAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV01> forCorporateActionMovementReversalAdviceV01 = new MMConstraint<CorporateActionMovementReversalAdviceV01>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV02
	 * CorporateActionMovementReversalAdviceV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV02> forCorporateActionMovementReversalAdviceV02 = new MMConstraint<CorporateActionMovementReversalAdviceV02>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV03
	 * CorporateActionMovementReversalAdviceV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV03> forCorporateActionMovementReversalAdviceV03 = new MMConstraint<CorporateActionMovementReversalAdviceV03>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			owner_lazy = () -> CorporateActionMovementReversalAdviceV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV04
	 * CorporateActionMovementReversalAdviceV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV04> forCorporateActionMovementReversalAdviceV04 = new MMConstraint<CorporateActionMovementReversalAdviceV04>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV05);
			owner_lazy = () -> CorporateActionMovementReversalAdviceV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV05
	 * CorporateActionMovementConfirmationV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV04
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV05> forCorporateActionMovementConfirmationV05 = new MMConstraint<CorporateActionMovementConfirmationV05>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV04;
			owner_lazy = () -> CorporateActionMovementConfirmationV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV05
	 * CorporateActionInstructionStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV04
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV05> forCorporateActionInstructionStatusAdviceV05 = new MMConstraint<CorporateActionInstructionStatusAdviceV05>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV05.mmObject();
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
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionV06
	 * ConstraintAdditionalInformationRule.forCorporateActionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionV04
	 * ConstraintAdditionalInformationRule.forCorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> forCorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "Elements in AdditionalInformation and CorporateActionInstruction/CorporateActionAdditionalInformation  must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV05
	 * CorporateActionMovementReversalAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV04
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV05> forCorporateActionMovementReversalAdviceV05 = new MMConstraint<CorporateActionMovementReversalAdviceV05>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV04;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV06
	 * CorporateActionMovementConfirmationV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV07
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementConfirmationV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementConfirmationV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementConfirmationV06> forCorporateActionMovementConfirmationV06 = new MMConstraint<CorporateActionMovementConfirmationV06>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementConfirmationV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementConfirmationV05;
			owner_lazy = () -> CorporateActionMovementConfirmationV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionCancellationRequestStatusAdviceV05
	 * CorporateActionInstructionCancellationRequestStatusAdviceV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV06
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionCancellationRequestStatusAdviceV04
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionCancellationRequestStatusAdviceV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05> forCorporateActionInstructionCancellationRequestStatusAdviceV05 = new MMConstraint<CorporateActionInstructionCancellationRequestStatusAdviceV05>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionCancellationRequestStatusAdviceV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionCancellationRequestStatusAdviceV04;
			owner_lazy = () -> CorporateActionInstructionCancellationRequestStatusAdviceV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV06
	 * CorporateActionInstructionStatusAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionInstructionStatusAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionInstructionStatusAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionStatusAdviceV06> forCorporateActionInstructionStatusAdviceV06 = new MMConstraint<CorporateActionInstructionStatusAdviceV06>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionInstructionStatusAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionInstructionStatusAdviceV05;
			owner_lazy = () -> CorporateActionInstructionStatusAdviceV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV06
	 * CorporateActionMovementReversalAdviceV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV07
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#forCorporateActionMovementReversalAdviceV05
	 * ConstraintAdditionalInformationRule.
	 * forCorporateActionMovementReversalAdviceV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionMovementReversalAdviceV06> forCorporateActionMovementReversalAdviceV06 = new MMConstraint<CorporateActionMovementReversalAdviceV06>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionMovementReversalAdviceV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "All elements in the AdditionalInformation sequence must not\ncontain information that can be provided in a structured field unless\nbilaterally agreed or advised differently in the element definition\nas in NarrativeVersion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.forCorporateActionMovementReversalAdviceV05;
			owner_lazy = () -> CorporateActionMovementReversalAdviceV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forUpdatedAdditionalInformation2
	 * ConstraintAdditionalInforrmationRule.forUpdatedAdditionalInformation2}</li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation8> forUpdatedAdditionalInformation8 = new MMConstraint<UpdatedAdditionalInformation8>() {
		{
			validator = ConstraintAdditionalInformationRule::checkUpdatedAdditionalInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forUpdatedAdditionalInformation2;
			owner_lazy = () -> UpdatedAdditionalInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27
	 * CorporateActionNarrative27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative11
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative11}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative27> forCorporateActionNarrative27 = new MMConstraint<CorporateActionNarrative27>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative11;
			owner_lazy = () -> CorporateActionNarrative27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
	 * CorporateActionNarrative26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative24
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative24}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative26> forCorporateActionNarrative26 = new MMConstraint<CorporateActionNarrative26>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative24;
			owner_lazy = () -> CorporateActionNarrative26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28
	 * CorporateActionNarrative28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative6
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative6}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative28> forCorporateActionNarrative28 = new MMConstraint<CorporateActionNarrative28>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative6;
			owner_lazy = () -> CorporateActionNarrative28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29
	 * CorporateActionNarrative29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule#forCorporateActionNarrative20
	 * ConstraintAdditionalInforrmationRule.forCorporateActionNarrative20}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative29> forCorporateActionNarrative29 = new MMConstraint<CorporateActionNarrative29>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintAdditionalInforrmationRule.forCorporateActionNarrative20;
			owner_lazy = () -> CorporateActionNarrative29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37
	 * CorporateActionNarrative37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative37> forCorporateActionNarrative37 = new MMConstraint<CorporateActionNarrative37>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion.";
			owner_lazy = () -> CorporateActionNarrative37.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41
	 * CorporateActionNarrative41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative41> forCorporateActionNarrative41 = new MMConstraint<CorporateActionNarrative41>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative41.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36
	 * CorporateActionNarrative36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,"
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative36> forCorporateActionNarrative36 = new MMConstraint<CorporateActionNarrative36>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative36;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition as in NarrativeVersion,";
			owner_lazy = () -> CorporateActionNarrative36.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation10
	 * UpdatedAdditionalInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<UpdatedAdditionalInformation10> forUpdatedAdditionalInformation10 = new MMConstraint<UpdatedAdditionalInformation10>() {
		{
			validator = ConstraintAdditionalInformationRule::checkUpdatedAdditionalInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The Additionalnformation element must not contain information that can be provided in a structured field unless bilaterally agreed.";
			owner_lazy = () -> UpdatedAdditionalInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative39
	 * CorporateActionNarrative39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionNarrative39> forCorporateActionNarrative39 = new MMConstraint<CorporateActionNarrative39>() {
		{
			validator = ConstraintAdditionalInformationRule::checkCorporateActionNarrative39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationRule";
			definition = "The AdditionalInformation field in all elements must not contain information that can be provided in a structured field unless bilaterally agreed or advised differently in the element definition.";
			owner_lazy = () -> CorporateActionNarrative39.mmObject();
		}
	};

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV08(CorporateActionMovementConfirmationV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not<br>
	 * contain information that can be provided in a structured field unless<br>
	 * bilaterally agreed or advised differently in the element definition<br>
	 * as in AdditionalInformation/NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV08(CorporateActionMovementReversalAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV07(CorporateActionInstructionCancellationRequestStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionInstructionV07(CorporateActionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV08(CorporateActionInstructionStatusAdviceV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionInstruction002V07(CorporateActionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not<br>
	 * contain information that can be provided in a structured field unless<br>
	 * bilaterally agreed or advised differently in the element definition<br>
	 * as in AdditionalInformation/NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdvice002V08(CorporateActionMovementReversalAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdvice002V07(CorporateActionInstructionCancellationRequestStatusAdvice002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdvice002V08(CorporateActionInstructionStatusAdvice002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmation002V08(CorporateActionMovementConfirmation002V08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV06(CorporateActionInstructionCancellationRequestStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/AdditionalInformation must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionInstructionV06(CorporateActionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * AdditionalInformation/NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV07(CorporateActionMovementConfirmationV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV07(CorporateActionInstructionStatusAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not<br>
	 * contain information that can be provided in a structured field unless<br>
	 * bilaterally agreed or advised differently in the element definition<br>
	 * as in AdditionalInformation/NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV07(CorporateActionMovementReversalAdviceV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV01(CorporateActionInstructionCancellationRequestStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV02(CorporateActionInstructionCancellationRequestStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV03(CorporateActionInstructionCancellationRequestStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV04(CorporateActionInstructionCancellationRequestStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV01(CorporateActionInstructionStatusAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV02(CorporateActionInstructionStatusAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV03(CorporateActionInstructionStatusAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV04(CorporateActionInstructionStatusAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV01(CorporateActionMovementConfirmationV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV02(CorporateActionMovementConfirmationV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV03(CorporateActionMovementConfirmationV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV04(CorporateActionMovementConfirmationV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV01(CorporateActionMovementReversalAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV02(CorporateActionMovementReversalAdviceV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV03(CorporateActionMovementReversalAdviceV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV04(CorporateActionMovementReversalAdviceV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV05(CorporateActionMovementConfirmationV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV05(CorporateActionInstructionStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Elements in AdditionalInformation and
	 * CorporateActionInstruction/CorporateActionAdditionalInformation must not
	 * contain information that can be provided in a structured field unless
	 * bilaterally agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV05(CorporateActionMovementReversalAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementConfirmationV06(CorporateActionMovementConfirmationV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionCancellationRequestStatusAdviceV05(CorporateActionInstructionCancellationRequestStatusAdviceV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation element must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed.
	 */
	public static void checkCorporateActionInstructionStatusAdviceV06(CorporateActionInstructionStatusAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * All elements in the AdditionalInformation sequence must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionMovementReversalAdviceV06(CorporateActionMovementReversalAdviceV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation8(UpdatedAdditionalInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative27(CorporateActionNarrative27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionNarrative26(CorporateActionNarrative26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative28(CorporateActionNarrative28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative29(CorporateActionNarrative29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion.
	 */
	public static void checkCorporateActionNarrative37(CorporateActionNarrative37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative41(CorporateActionNarrative41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition as in
	 * NarrativeVersion,
	 */
	public static void checkCorporateActionNarrative36(CorporateActionNarrative36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The Additionalnformation element must not contain information that can be
	 * provided in a structured field unless bilaterally agreed.
	 */
	public static void checkUpdatedAdditionalInformation10(UpdatedAdditionalInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The AdditionalInformation field in all elements must not contain
	 * information that can be provided in a structured field unless bilaterally
	 * agreed or advised differently in the element definition.
	 */
	public static void checkCorporateActionNarrative39(CorporateActionNarrative39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}